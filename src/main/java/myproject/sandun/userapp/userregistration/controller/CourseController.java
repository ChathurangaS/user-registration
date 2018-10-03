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

    @RequestMapping(method = RequestMethod.GET, value = "/courses")
    public List<Course> getAllCourses() {
        return courseService.loadAllCourses();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/course/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.loadCourseById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/course")
    public void addCourse(@RequestBody Course user) {
        courseService.addCourse(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/course")
    public void updateCourse(@RequestBody Course user) {
        courseService.updateCourse(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/course")
    public void deleteCourse(@RequestBody Course user) {
        courseService.deleteCourse(user);
    }


}
