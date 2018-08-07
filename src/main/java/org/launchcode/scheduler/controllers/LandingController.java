package org.launchcode.scheduler.controllers;

import org.launchcode.scheduler.models.Task;
import org.launchcode.scheduler.models.data.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class LandingController {

    @Autowired
    private TaskDao taskDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("tasks", taskDao.findAll());
        model.addAttribute("header", "Scheduler");
        model.addAttribute("title", "Home | Scheduler App");
        return "index";
    }

    @RequestMapping(value = "add-task", method = RequestMethod.GET)
    public String displayAddTaskForm(Model model) {

        String header = "Add Task";
        model.addAttribute("header", header);
        model.addAttribute("title", header + " | Scheduler App");
        model.addAttribute(new Task());
        return "add-task";
    }

    @RequestMapping(value = "add-task", method = RequestMethod.POST)
    public String processAddTaskForm(Model model, @ModelAttribute @Valid Task newTask, Errors errors) {

        if (errors.hasErrors()) {
            String header = "Add Task";
            model.addAttribute("header", header);
            model.addAttribute("title", header + " | Scheduler App");
            return "add-task";
        }

        taskDao.save(newTask);
        return "redirect:";
    }

    @RequestMapping(value = "remove-task", method = RequestMethod.GET)
    public String displayRemoveTaskForm(Model model) {

        model.addAttribute("tasks", taskDao.findAll());
        String header = "Remove Tasks";
        model.addAttribute("header", header);
        model.addAttribute("title", header + " | Scheduler App");
        return "remove-task";
    }

    @RequestMapping(value = "remove-task", method = RequestMethod.POST)
    public String processRemoveTaskForm(@RequestParam int[] taskIds) {
        for (int taskId : taskIds) {
            taskDao.delete(taskId);
        }
        return "redirect:";
    }

}
