package it.sibguys.entities;

import java.time.LocalDate;
import java.util.List;

public class Project {
    private long id;
    private String name;
    private List<User> userList;
    private List<Task> taskList;
    private LocalDate deadline;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getProgress() {
        return 0;
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
        return 1L;
    }
    public List<User> getUsersByProfession(String job){

    }
}
