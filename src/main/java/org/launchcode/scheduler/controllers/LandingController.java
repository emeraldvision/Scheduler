package org.launchcode.scheduler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("header", "Scheduler");
        model.addAttribute("title", "Home | Scheduler App");
        return "index";
    }

    @RequestMapping(value = "add-task")
    public String addTask(Model model) {

        String header = "Add Task";
        model.addAttribute("header", header);
        model.addAttribute("title", header + " | Scheduler App");
        return "add-task";
    }

}
