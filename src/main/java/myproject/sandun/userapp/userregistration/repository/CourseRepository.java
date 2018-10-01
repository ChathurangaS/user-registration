package myproject.sandun.userapp.userregistration.repository;

import myproject.sandun.userapp.userregistration.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
