package org.launchcode.scheduler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Scheduler App | Home");
        return "index";
    }

    @RequestMapping(value = "add")
    public String addTask(Model model) {

        model.addAttribute("title", "Add Task");
        return "add-task";
    }

}
