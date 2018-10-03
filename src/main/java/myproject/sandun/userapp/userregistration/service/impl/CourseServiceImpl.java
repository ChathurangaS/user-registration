package myproject.sandun.userapp.userregistration.service.impl;

import myproject.sandun.userapp.userregistration.model.Course;
import myproject.sandun.userapp.userregistration.repository.CourseRepository;
import myproject.sandun.userapp.userregistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {


    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> loadAllCourses() {
        List<Course> courseList = courseRepository.findAll();
        if (!courseList.isEmpty()) {
            courseList.forEach(course -> {
                if (!course.getUserList().isEmpty()) {
                    course.getUserList().forEach(user -> {
                        user.setCourse(null);
                    });
                }
            });
        }
        return courseList;
    }

    @Override
    public Course loadCourseById(Long id) {
        Course course = courseRepository.findById(id).orElse(null);
        if (!course.getUserList().isEmpty()) {
            course.getUserList().forEach(user -> {
                user.setCourse(null);
            });
        }
        return course;
    }

    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courseRepository.delete(course);
    }


}
