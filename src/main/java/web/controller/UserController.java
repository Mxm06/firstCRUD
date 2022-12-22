package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Model.User;
import web.service.UserService;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public String userPage(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("patchingUser", new User());
        model.addAttribute("deletingUser",new User());
        model.addAttribute("userList", userService.listAllUsers());
        return "users";
    }

    //    @GetMapping("users/new")
//    public String newUser(Model model) {
//        model.addAttribute("user",new User());
//        return "newUser";
//    }
    @PostMapping("users")
    public String createUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/users";
    }

    @PatchMapping("users")
    public String patch(@ModelAttribute("patchingUser") User user) {
        userService.update(user);
        return "redirect:/users";
    }

    @DeleteMapping("users")
    public String delete(@ModelAttribute("deletingUser") User user) {
        userService.delete(user);
        return "redirect:/users";
    }
}
