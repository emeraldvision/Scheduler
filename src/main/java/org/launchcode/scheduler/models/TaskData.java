package org.launchcode.scheduler.models;

import java.util.ArrayList;

public class TaskData {

    static ArrayList<Task> tasks = new ArrayList<>();

    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    public static void add(Task newTask) {
        tasks.add(newTask);
    }

    public static void remove (int id) {
        Task taskToRemove = findById(id);
        tasks.remove(taskToRemove);
    }

    public static Task findById(int id) {
        Task theTask = null;
        for (Task candidateTask : tasks) {
            if (candidateTask.getTaskId() == id) {
                theTask = candidateTask;
            }
        }
        return theTask;
    }
}
