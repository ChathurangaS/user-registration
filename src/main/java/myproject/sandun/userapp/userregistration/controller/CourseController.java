package myproject.sandun.userapp.userregistration.controller;

import myproject.sandun.userapp.userregistration.model.Course;
import myproject.sandun.userapp.userregistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/courses")
    public List<Course> getAllCities() {
        return courseService.loadAllCourses();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/course/{id}")
    public Course getCityById(@PathVariable Long id) {
        return courseService.loadCourseById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/course")
    public void addUser(@RequestBody Course user) {
        courseService.addCourse(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/course")
    public void updateUser(@RequestBody Course user) {
        courseService.updateCourse(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/course")
    public void deleteUser(@RequestBody Course user) {
        courseService.deleteCourse(user);
    }

}
