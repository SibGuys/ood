package it.sibguys.entities;

import it.sibguys.entities.user.User;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Task {
    private long id;
    private String name;
    private String content;
    private boolean status;
    private int difficulty;
    private User assigneeUser;
    private LocalDate deadline;

    public Task(long id, String name, String content, int difficulty, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.difficulty = difficulty;
        this.deadline = deadline;
        status = false;
        assigneeUser = null;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public boolean getStatus() {
        return status;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDone() {
        status = true;
    }

    public void addUser(User user) {
        assigneeUser = user;
    }

    public User getAssigneeUser() {
        return assigneeUser;
    }

    public void removeUser() {
        assigneeUser = null;
    }

    public long getRestDays() {
        return Period.between(LocalDate.now(), deadline).getDays();
    }
}
