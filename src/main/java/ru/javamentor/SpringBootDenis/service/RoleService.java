package ru.javamentor.SpringBootDenis.service;

import ru.javamentor.SpringBootDenis.model.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getRoleSet(Set<String> roles);

    Role getDefaultRole();
}
