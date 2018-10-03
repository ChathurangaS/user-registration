package myproject.sandun.userapp.userregistration.controller;

import myproject.sandun.userapp.userregistration.model.Subject;
import myproject.sandun.userapp.userregistration.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {


    @Autowired
    SubjectService subjectService;

    @RequestMapping(method = RequestMethod.GET, value = "/subjects")
    public List<Subject> getAllSubjects() {
        return subjectService.loadAllSubjects();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/subject/{id}")
    public Subject getSubjectById(@PathVariable Long id) {
        return subjectService.loadSubjectById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/subject")
    public void addSubject(@RequestBody Subject subject) {
        subjectService.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/subject")
    public void updateSubject(@RequestBody Subject subject) {
        subjectService.updateSubject(subject);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/subject")
    public void deleteSubject(@RequestBody Subject subject) {
        subjectService.deleteSubject(subject);
    }
}
