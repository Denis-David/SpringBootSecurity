package ru.javamentor.SpringBootDenis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.javamentor.SpringBootDenis.model.User;
import ru.javamentor.SpringBootDenis.service.UserService;


@Controller
@RequestMapping("/user/**")
public class UserViewController {
    UserService userService;

    @Autowired
    public UserViewController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("userinfo")
    public ModelAndView showUserForm(@AuthenticationPrincipal User user) {
        ModelAndView modelAndView = new ModelAndView("/user/userinfo");
        //userService.getUserByName(name);
        modelAndView.addObject("userData", user);
        return modelAndView;
    }

}
