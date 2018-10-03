package myproject.sandun.userapp.userregistration.controller;

import myproject.sandun.userapp.userregistration.model.Course;
import myproject.sandun.userapp.userregistration.model.Subject;
import myproject.sandun.userapp.userregistration.model.User;
import myproject.sandun.userapp.userregistration.service.CourseService;
import myproject.sandun.userapp.userregistration.service.SubjectService;
import myproject.sandun.userapp.userregistration.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@RestController
public class DataSyncController {

    private final static Logger logger = LoggerFactory.getLogger(DataSyncController.class);

    @Autowired
    private CourseService courseService;

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/data-sync")
    public String dataSync() {

        courseService.addCourse(new Course(1L, "IT", "Information Technology"));
        courseService.addCourse(new Course(2L, "Eng", "engineering"));
        courseService.addCourse(new Course(3L, "BM", "Business Management"));

        subjectService.addSubject(new Subject(1L, "SE I", "Software Engineering I"));
        subjectService.addSubject(new Subject(2L, "PS", "Probability and Statistics"));
        subjectService.addSubject(new Subject(3L, "OOP", "Object Oriented Programming"));

        Set<Subject> subjectSetSandun = new HashSet<Subject>();
        subjectSetSandun.add(new Subject(1L));
        subjectSetSandun.add(new Subject(2L));
        subjectSetSandun.add(new Subject(3L));
        Set<Subject> subjectSetSupun = new HashSet<Subject>();
        subjectSetSupun.add(new Subject(1L));
        subjectSetSupun.add(new Subject(3L));
        Set<Subject> subjectSetKalana = new HashSet<Subject>();
        subjectSetKalana.add(new Subject(3L));


        userService.addUser(new User(1L, "Sandun Chathuranga", stringDateToUtilDate("12/09/1993"), new Date(), new Course(1L), subjectSetSandun));
        userService.addUser(new User(2L, "Supun Isuranga", stringDateToUtilDate("21/12/1996"), new Date(), new Course(3L), subjectSetSupun));
        userService.addUser(new User(3L, "Kalana Weerarathne", stringDateToUtilDate("15/09/1992"), new Date(), new Course(1L), subjectSetKalana));

        return "data sync done";
    }

    private Date stringDateToUtilDate(String stringDate) {
        Date date = new Date();
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        } catch (ParseException e) {
            logger.error("covert string date to util date in sync-data : ", e);
        }
        return date;
    }

}
