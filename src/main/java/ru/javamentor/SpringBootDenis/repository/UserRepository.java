package ru.javamentor.SpringBootDenis.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javamentor.SpringBootDenis.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByName(String name);
}

