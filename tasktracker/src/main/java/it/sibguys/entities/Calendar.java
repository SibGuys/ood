package it.sibguys.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calendar {
    private List<Task> allTasks;

    public Calendar(List<Task> allTasks) {
        this.allTasks = allTasks;
    }

    public List<Task> getTaskListExpireToday() {
        return allTasks.stream().filter(x -> x.getRestDays() <= 1).collect(Collectors.toList());
    }

    public List<Task> getTaskListExpireNextNDays(int n) {
        return allTasks.stream().filter(x -> x.getRestDays() <= n).collect(Collectors.toList());
    }
}
