package com.salesforce.controller;

import com.salesforce.model.Post;
import com.salesforce.model.User;
import com.salesforce.service.PostService;
import com.salesforce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    private PostService postService;

    @Autowired
    protected UserService userService;

    @RequestMapping(value = "users/login")
    public String login() {
        return "users/login";
    }

    @RequestMapping(value = "users/registration")
    public String registration() {
        return "users/registration";
    }

    @RequestMapping(value = "users/login", method = RequestMethod.POST)
    public String loginUser(User user) {
        if (userService.login(user))
            return "redirect:/posts";
        else
            return "users/login";
    }

    @RequestMapping(value = "users/registration", method = RequestMethod.POST)
    public String registration(User user) {
        return "users/login";
    }

    @RequestMapping(value = "users/logout", method = RequestMethod.POST)
    public String logout(Model model) {
        ArrayList<Post> allPosts = postService.getAllPosts();
        model.addAttribute("posts", allPosts);
        return "index";
    }
}
