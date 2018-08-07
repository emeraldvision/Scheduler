package org.launchcode.scheduler.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Task {

    private int taskId;

    @NotNull
    @Size(min = 3, max = 25, message = "Please enter a name")
    private String name;

    @NotNull
    @Size(min = 1, message = "Please enter a start time")
    private String startTime;

    @NotNull
    @Size(min = 1, message = "Please enter an ending time")
    private String endTime;

    @NotNull
    // blank description becomes empty String
    private String description;

    private static int nextId = 1;

    public Task(String name, String startTime, String endTime, String description) {
        this();
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public Task() {
        taskId = nextId;
        nextId++;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}