package org.launchcode.scheduler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LandingController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Scheduler App Homepage";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public String addTask() {
        return "Add Task Page";
    }

}
