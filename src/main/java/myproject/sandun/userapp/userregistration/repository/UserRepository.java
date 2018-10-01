package myproject.sandun.userapp.userregistration.repository;

import myproject.sandun.userapp.userregistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long> {
}
