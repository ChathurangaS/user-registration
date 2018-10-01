package myproject.sandun.userapp.userregistration;

import myproject.sandun.userapp.userregistration.model.Course;
import myproject.sandun.userapp.userregistration.model.User;
import myproject.sandun.userapp.userregistration.repository.CourseRepository;
import myproject.sandun.userapp.userregistration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class UserRegistrationApplication implements CommandLineRunner {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private UserRepository userRepository;


    public static void main(String[] args) {
        SpringApplication.run(UserRegistrationApplication.class, args);
    }

    @Override
    public void run(String... args) {

//        System.out.println("DATASOURCE = " + dataSource);

//        saveCourseDetails();
//        saveUserDetails();


//        System.out.println("Done!");


    }

    private void saveCourseDetails() {
        System.out.println("EXECUTE COURSE DETAILS");
        courseRepository.save(new Course(1L, "IT", "Information Technology"));
        courseRepository.save(new Course(2L, "Eng", "engineering"));
        courseRepository.save(new Course(3L, "BM", "Business Management"));
        System.out.println("EXECUTE COURSE DETAILS DONE!");
    }

    private void saveUserDetails() {
        System.out.println("EXECUTE USER DETAILS");
        userRepository.save(new User(1L, "Sandun Chathuranga", new Date(), new Date(), new Course(1L)));
        userRepository.save(new User(2L, "Supun Isuranga", new Date(), new Date(), new Course(3L)));
        userRepository.save(new User(3L, "Kalana", new Date(), new Date(), new Course(1L)));
        System.out.println("EXECUTE USER DETAILS DONE!");

    }

}
