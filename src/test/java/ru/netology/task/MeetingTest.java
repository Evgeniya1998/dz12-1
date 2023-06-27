package ru.netology.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {
    @Test
    public void testGetProject(){
        Meeting meeting = new Meeting(54, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
        String expected = "Приложение НетоБанка";
        String actual = meeting.getProject();
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testGetStart(){
        Meeting meeting = new Meeting(54, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
        String expected = "Во вторник после обеда";
        String actual = meeting.getStart();
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testGetTopic(){
        Meeting meeting = new Meeting(54, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");
        String expected = "Выкатка 3й версии приложения";
        String actual = meeting.getTopik();
        Assertions.assertEquals(actual, expected);
    }

}