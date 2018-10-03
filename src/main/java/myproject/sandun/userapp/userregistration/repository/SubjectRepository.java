package myproject.sandun.userapp.userregistration.repository;

import myproject.sandun.userapp.userregistration.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
