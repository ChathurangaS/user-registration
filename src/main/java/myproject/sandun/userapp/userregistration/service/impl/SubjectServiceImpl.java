package myproject.sandun.userapp.userregistration.service.impl;

import myproject.sandun.userapp.userregistration.model.Subject;
import myproject.sandun.userapp.userregistration.repository.SubjectRepository;
import myproject.sandun.userapp.userregistration.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> loadAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject loadSubjectById(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    @Override
    public void addSubject(Subject user) {
        subjectRepository.save(user);
    }

    @Override
    public void updateSubject(Subject user) {
        subjectRepository.save(user);
    }

    @Override
    public void deleteSubject(Subject user) {
        subjectRepository.delete(user);
    }
}
