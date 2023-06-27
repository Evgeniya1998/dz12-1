package ru.netology.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testSimpleTaskFounded() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("родителям");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSimpleTaskNotFounded() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("Родителям");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testEpicFounded() {
        Epic epic = new Epic(55, new String[]{"Молоко", "Яйца", "Хлеб"});
        boolean actual = epic.matches("Молоко");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testEpicNotFounded() {
        Epic epic = new Epic(55, new String[]{"Молоко", "Яйца", "Хлеб"});
        boolean actual = epic.matches("торт");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMeetingFoundedToric() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("Выкатка");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingNotFoundedTopic() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
        boolean actual = meeting.matches("торт");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMeetingFoundedProject() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = meeting.matches("Приложение");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingNotFoundedProject() {
        Task task = new Task(121);
        int actual = task.getId();
        int expected = 121;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetId() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
        boolean actual = meeting.matches("торт");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testEquels() {
        Task task = new Task(555);
        boolean actual = task.equals(5);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}