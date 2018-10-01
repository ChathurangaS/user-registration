package myproject.sandun.userapp.userregistration.controller;

import myproject.sandun.userapp.userregistration.model.User;
import myproject.sandun.userapp.userregistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<User> getAllUsers() {
        return userService.loadAllUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.loadUserById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user")
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }


}
