package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
public class UserController {

private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/main")
    public String getUsers(Model model){
        List<User> users = userService.getAll();
        model.addAttribute("main", users);
        return "main";
    }
    @GetMapping("/addUser")
    public String addUser() {
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUserPost(@ModelAttribute("user") User user){
        userService.addUser(user);
        return "redirect:/main";
    }

    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") Long id,Model model){
        model.addAttribute("user",userService.getUser(id));
        return "updateUser";
    }

    @PatchMapping("/updateUser/{id}")
    public String updateUserPost(@ModelAttribute User user){
        userService.updateUser(user);
        return "redirect:/main";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/main";
    }
}



