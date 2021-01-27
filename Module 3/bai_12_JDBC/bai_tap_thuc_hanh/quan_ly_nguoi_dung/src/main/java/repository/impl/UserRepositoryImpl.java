package repository.impl;

import bean.User;
import repository.UserRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
