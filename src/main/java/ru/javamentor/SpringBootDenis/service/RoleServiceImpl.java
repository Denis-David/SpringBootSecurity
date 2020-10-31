package ru.javamentor.SpringBootDenis.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javamentor.SpringBootDenis.model.Role;
import ru.javamentor.SpringBootDenis.repository.RoleRepository;


import java.util.Set;

@Service
//@Transactional
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional
    @Override
    public Set<Role> getRoleSet(Set<String> roles) {
        return roleRepository.getRolesByNameIn(roles);
    }
    @Transactional
    @Override
    public Role getDefaultRole() {
        String defaultRoleName = "ROLE_USER";
        return roleRepository.getRoleByName(defaultRoleName);
    }

}

