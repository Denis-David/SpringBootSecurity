package ru.javamentor.SpringBootDenis.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import ru.javamentor.SpringBootDenis.model.User;

import java.util.List;

@Service
public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    void deleteUser(Long id);

    void updateUser(User user);

    User getUserById(Long id);

    UserDetails loadUserByUsername(String username);

    User getUserByName(String name);

}
