package org.launchcode.scheduler.controllers;

import org.launchcode.scheduler.models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class LandingController {

    static ArrayList<Task> tasks = new ArrayList<>();

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("tasks", tasks);
        model.addAttribute("header", "Scheduler");
        model.addAttribute("title", "Home | Scheduler App");
        return "index";
    }

    @RequestMapping(value = "add-task", method = RequestMethod.GET)
    public String displayAddTaskForm(Model model) {

        String header = "Add Task";
        model.addAttribute("header", header);
        model.addAttribute("title", header + " | Scheduler App");
        return "add-task";
    }

    @RequestMapping(value = "add-task", method = RequestMethod.POST)
    public String processAddTaskForm(Model model, @RequestParam String taskName, @RequestParam String startTime, @RequestParam String endTime, @RequestParam String description) {

        Task newTask = new Task(taskName, startTime, endTime, description);
        tasks.add(newTask);
        return "redirect:";
    }

}
