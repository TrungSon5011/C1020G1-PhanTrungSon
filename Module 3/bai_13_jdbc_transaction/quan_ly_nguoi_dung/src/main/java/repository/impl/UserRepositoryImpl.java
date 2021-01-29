package repository.impl;

import bean.User;
import repository.UserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl  implements UserRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private final String SQL_FIND_ALL = "select id,`name`, email, country " + "from `users` order by `name`";
    private final String SQL_UPDATE = "update users set `name` = ?, email = ?, country = ? "+"where id = ?";
    private final String SQL_FIND_BY_ID = "select id,`name`,email, country "+"from users where id=?";
    private final String SQL_DELETE = "delete from users where id= ?";
    private final String SQL_INSERT = "INSERT INTO users (`name`,email,country) VALUES (?,?,?)";
    private final String SQL_FIND_BY_COUNTRY = "select * from users where country like ?";
    private final String SQL_PROCEDURE_GET_USERS_BY_ID = "call get_users_by_id(?)";
    private final String SQL_PROCEDURE_INSERT_USER = "call insert_user(?,?,?) ";
    private final String SQL_PROCEDURE_FIND_ALL = "call get_users()";
    private final String SQL_PROCEDURE_UPDATE = "call update_user(?,?,?,?)";
    private final String SQL_PROCEDURE_DELETE = "call delete_user(?)";
    @Override
    public void save(User user) {
        if(user.getId() == null){
            // register
            try {
                PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SQL_INSERT);
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getEmail());
                preparedStatement.setString(3, user.getCountry());
                preparedStatement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else {
            try {
                PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SQL_UPDATE);
                preparedStatement.setString(1,user.getName());
                preparedStatement.setString(2,user.getEmail());
                preparedStatement.setString(3,user.getCountry());
                preparedStatement.setString(4, String.valueOf(user.getId()));
                preparedStatement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(SQL_FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = null;
            while (resultSet.next()){
                user = new User();
                user.setId(Integer.parseInt(resultSet.getString("id")));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public User findById(Integer id) {
        User user = new User();
        PreparedStatement preparedStatement =
                null;
        try {
            preparedStatement = this.baseRepository.getConnection().prepareStatement(SQL_FIND_BY_ID);
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                user.setId(Integer.valueOf(resultSet.getString("id")));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public void deleteById(Integer id) {
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(SQL_DELETE);
            preparedStatement.setString(1, String.valueOf(id));
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<User> findByCountry(String country) {
        List<User> userList = new ArrayList<>();
        User user = null;
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(SQL_FIND_BY_COUNTRY);
            preparedStatement.setString(1,"%"+country+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                user = new User();
                user.setId(Integer.valueOf(resultSet.getString("id")));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return userList;
    }

    @Override
    public User getUserById(Integer id) {
        User user = null;

        try {
            CallableStatement callableStatement = baseRepository.getConnection().prepareCall(SQL_PROCEDURE_GET_USERS_BY_ID);
            callableStatement.setInt(1,id);
            ResultSet resultSet = callableStatement.executeQuery();
            if(resultSet.next()){
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id,name,email,country);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        try {
            CallableStatement callableStatement = baseRepository.getConnection().prepareCall(SQL_PROCEDURE_INSERT_USER);
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.executeUpdate();
        }catch (SQLException sqlException){
           sqlException.getSQLState();
        }

    }

    @Override
    public List<User> findAllStore() {
        List<User> userList = new ArrayList<>();
        User user = null;
        try {
            CallableStatement callableStatement = baseRepository.getConnection().prepareCall(SQL_PROCEDURE_FIND_ALL);
            ResultSet resultSet = callableStatement.executeQuery();

            while (resultSet.next()){
                user = new User();
                user.setId(Integer.valueOf(resultSet.getString("id")));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return userList;
    }

    @Override
    public void deleteByIdStore(Integer id) {
        try {
            CallableStatement callableStatement = baseRepository.getConnection().prepareCall(SQL_PROCEDURE_DELETE);
            callableStatement.setInt(1,id);
            callableStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public void updateByIdStore(String name, String email, String country, Integer id) {
        try {
            CallableStatement callableStatement = baseRepository.getConnection().prepareCall(SQL_PROCEDURE_UPDATE);
            callableStatement.setString(1,name);
            callableStatement.setString(2,email);
            callableStatement.setString(3,country);
            callableStatement.setString(4, String.valueOf(id));
            callableStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public void addUserTransaction() {
        Connection connection = baseRepository.getConnection();
        User user = new User("kien", "kienhoang@gmail.com", "vn");
        int[] permision = {1, 2, 4};
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (`name`,email, country) values (?,?,?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            int rowAffect = preparedStatement.executeUpdate();

            if(rowAffect == 1){

                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO User_Permision(user_id,permision_id) values(?,?)");
                connection.commit();
            }else {
                connection.rollback();
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public void insertWithoutTransaction() {
        Connection connection = baseRepository.getConnection();
        int affectRow = 0;
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into users(`name`,email, country) values(?,?,?)");
            preparedStatement.setString(1,"cho");
            preparedStatement.setString(2,"meo");
            preparedStatement.setString(3,"heo");
            affectRow = preparedStatement.executeUpdate();
            if(affectRow == 2){
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO User_Permision values (?,?)");
                preparedStatement1.setString(1,"1");
                preparedStatement1.setString(2,"2");
                affectRow += preparedStatement1.executeUpdate();
            }
            if(affectRow == 2){connection.commit();}
            else {
                connection.rollback();
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
}
