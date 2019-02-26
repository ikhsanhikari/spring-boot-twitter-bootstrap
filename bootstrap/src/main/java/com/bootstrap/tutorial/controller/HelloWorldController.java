package com.bootstrap.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String helloWorld(Model model) {
        return "index";
    }

    @RequestMapping("/success")
    public String success(Model model) {
        return "success";
    }

    @RequestMapping("/warning")
    public String warning(Model model) {
        return "warning";
    }

    @RequestMapping("/danger")
    public String danger(Model model) {
        return "danger";
    }
}
