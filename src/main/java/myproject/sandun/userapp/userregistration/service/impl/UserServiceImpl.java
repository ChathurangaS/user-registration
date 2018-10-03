package myproject.sandun.userapp.userregistration.service.impl;

import myproject.sandun.userapp.userregistration.model.User;
import myproject.sandun.userapp.userregistration.repository.UserRepository;
import myproject.sandun.userapp.userregistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> loadAllUsers() {
        List<User> userList = userRepository.findAll();
        userList.forEach(user -> {
            if (user.getCourse() != null && user.getCourse().getUserList() != null) {
                user.getCourse().setUserList(null);
            }
        });
        return userList;
    }

    @Override
    public User loadUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }


    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<User> getUsersByCourse(Long id) {
        List<User> userList = userRepository.findByCourseId(id);
        userList.forEach(user -> {
            if (user.getCourse() != null && user.getCourse().getUserList() != null) {
                user.getCourse().setUserList(null);
            }
        });
        return userList;
    }
}
