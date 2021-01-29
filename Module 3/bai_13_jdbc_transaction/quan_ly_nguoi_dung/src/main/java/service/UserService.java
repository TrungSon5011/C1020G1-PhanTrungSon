package service;

import bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
    User findById(Integer id);
    void deleteById(Integer id);
    List<User> findByCountry(String country);
    User getUserById (Integer id);
    void insertUserStore(User user) throws SQLException;
    List<User> findAllStore();
    void deleteByIdStore(Integer id);
    void updateByIdStore(String name, String email, String country, Integer id);
    void addUserTransaction();
    void insertWithoutTransaction();

}
