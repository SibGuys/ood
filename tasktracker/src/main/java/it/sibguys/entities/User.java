package it.sibguys.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final long id;
    private final String name;
    private String profession;
    private final List<Task> taskList;

    public User(String name, String profession, long id) {
        taskList = new ArrayList<>();
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getProfession() {
        return this.profession;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }
    public void removeTask(Task task){
        taskList.remove(task);
    }
}
