package org.launchcode.scheduler.models;

public class Task {

    private int taskId;
    private String name;
    private String startTime;
    private String endTime;
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