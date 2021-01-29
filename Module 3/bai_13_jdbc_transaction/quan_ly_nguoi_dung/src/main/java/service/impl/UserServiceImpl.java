package service.impl;

import bean.User;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    static UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void save(User user) {
       userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findByCountry(String country) {
        return userRepository.findByCountry(country);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
            userRepository.insertUserStore(user);
    }

    @Override
    public List<User> findAllStore() {
        return userRepository.findAllStore();
    }

    @Override
    public void deleteByIdStore(Integer id) {
        userRepository.deleteByIdStore(id);
    }

    @Override
    public void updateByIdStore(String name, String email, String country, Integer id) {
        userRepository.updateByIdStore(name, email, country, id);
    }

    @Override
    public void addUserTransaction() {
        userRepository.addUserTransaction();
    }

    @Override
    public void insertWithoutTransaction() {
        userRepository.insertWithoutTransaction();
    }
}
