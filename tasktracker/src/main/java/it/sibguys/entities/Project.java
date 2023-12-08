package it.sibguys.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private final long id;
    private final String name;
    private final List<User> userList;
    private final List<Task> taskList;
    private final LocalDate deadline;

    public Project(long id, String name, LocalDate deadline) {
        this.name = name;
        this.id = id;
        this.deadline = deadline;
        userList = new ArrayList<>();
        taskList = new ArrayList<>();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getProgress() {
        int done = 0;
        int all = 0;
        for (Task task : taskList) {
            if (task.getStatus()) {
                done += task.getDifficulty();
            }
            all += task.getDifficulty();
        }
        return done / all;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(Long id) {
        userList.removeIf(user -> user.getId() == id);
    }

    public long getRestDays() {
        return Duration.between(LocalDate.now(), deadline).toDays();
    }

    public List<User> getUsersByProfession(String job) {
        List<User> profUsers = new ArrayList<>();
        for (User user : userList) {
            if (user.getProfession().equals(job))
                profUsers.add(user);
        }
        return profUsers;
    }
}
