package it.sibguys.entities;

import it.sibguys.entities.user.User;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TaskTest {
    private Task task;

    @Before
    public void setUp () {
        task = new Task(0, "Good Task", "Create super-duper project", 99999, LocalDate.of(2030, 9, 1));
    }

    @Test
    public void getId() {
        assertEquals(task.getId(), 0);
    }

    @Test
    public void getName() {
        assertEquals(task.getName(), "Good Task");
    }

    @Test
    public void getContent() {
        assertEquals(task.getContent(), "Create super-duper project");
    }

    @Test
    public void getStatus() {
        assertFalse(task.getStatus());
    }

    @Test
    public void getDifficulty() {
        assertEquals(task.getDifficulty(), 99999);
    }

    @Test
    public void setDone() {
        task.setDone();
        assertTrue(task.getStatus());
    }

    @Test
    public void addUser() {
        assertNull(task.getAssigneeUser());
        User boss = new User(0, "Admin", "BOSS");
        task.addUser(boss);
        assertEquals(task.getAssigneeUser(), boss);
    }

    @Test
    public void removeUser() {
        User boss = new User(0, "Admin", "BOSS");
        task.addUser(boss);
        task.removeUser();
        assertNull(task.getAssigneeUser());
    }

    @Test
    public void getRestDays() {
        assertTrue(task.getRestDays() > 0);
    }

    @Test
    public void getAssigneeUser() {
        User boss = new User(0, "Admin", "BOSS");
        task.addUser(boss);
        assertEquals(task.getAssigneeUser(), boss);
    }
}