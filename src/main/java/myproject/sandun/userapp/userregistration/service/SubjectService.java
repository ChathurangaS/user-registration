package myproject.sandun.userapp.userregistration.service;

import myproject.sandun.userapp.userregistration.model.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> loadAllSubjects();

    Subject loadSubjectById(Long id);

    void addSubject(Subject user);

    void updateSubject(Subject user);

    void deleteSubject(Subject user);
}
