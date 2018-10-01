package myproject.sandun.userapp.userregistration.service;

import myproject.sandun.userapp.userregistration.model.Course;

import java.util.List;

public interface CourseService {


    List<Course> loadAllCourses();

    Course loadCourseById(Long id);

    void addCourse(Course course);

    void updateCourse(Course course);

    void deleteCourse(Course course);
}
