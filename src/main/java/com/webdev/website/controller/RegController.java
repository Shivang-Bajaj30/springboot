package com.webdev.website.controller;

import com.webdev.website.model.RegModel;
import com.webdev.website.model.SampleModel;
import com.webdev.website.repo.RegRepo;
import com.webdev.website.service.RegService;
import com.webdev.website.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
//@RequestMapping("/api")
public class RegController {

    @Autowired
    RegService service;

    @Autowired
    RegRepo repo;

    @RequestMapping(value = "/index")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/index.html")
    public String Home() {
        return "index";
    }

    @RequestMapping(value = "/login.html")
    public String Login(@ModelAttribute("user") RegModel user) {
        return "login";
    }

    @RequestMapping(value = "/signup.html")
    public String SignUp(@ModelAttribute("user") RegModel user) {
        return "signup";
    }

    @RequestMapping(value = "/registerUser")
    public String registerUser(@ModelAttribute("user") RegModel user, Model m) {
        System.out.println(user);
        Optional<RegModel> email = repo.findById(user.getEmail());
        if (email.isPresent()) {
            return "sorry";
        }
        service.addUser(user);
        return "cong";
    }

    @PostMapping(value = "/loginUser")
    public String loginUser(@ModelAttribute("user") RegModel user, Model m) {
        System.out.println(user);
        Optional<RegModel> email = repo.findById(user.getEmail());
        if (email.isPresent()) {
            RegModel db = email.get();
            if (db.getPswd().equals(user.getPswd())) {
                m.addAttribute("user", db.getFname());
                return "Welcome";
            }
            else {
                return "lError";
            }
        }
        return "sorry";
    }
}

