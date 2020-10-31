package ru.javamentor.SpringBootDenis.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javamentor.SpringBootDenis.model.User;
import ru.javamentor.SpringBootDenis.service.RoleService;
import ru.javamentor.SpringBootDenis.service.UserService;

@Controller
@RequestMapping("/reg")
public class RegistrationController {

    private UserService userService;
    private RoleService roleService;

    @Autowired
    public RegistrationController(UserService userService, RoleService roleService){
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping
    public String showRegistrationForm(User user) {
        return "reg";
    }

    @PostMapping("/newuser")
    public String createUser(User user) {
        user.getRoleSet().add(roleService.getDefaultRole());
        userService.addUser(user);
        return "redirect:/index";
    }

}
