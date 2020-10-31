package ru.javamentor.SpringBootDenis.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javamentor.SpringBootDenis.model.Role;


import java.util.Set;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Set<Role> getRolesByNameIn(Set<String> roles);

    Role getRoleByName(String defaultRoleName);

}
