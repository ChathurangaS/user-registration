package myproject.sandun.userapp.userregistration.service;

import myproject.sandun.userapp.userregistration.model.User;

import java.util.List;

//@Transactional
public interface UserService {

    List<User> loadAllUsers();

    User loadUserById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    List<User> getUsersByCourse(Long id);
}
