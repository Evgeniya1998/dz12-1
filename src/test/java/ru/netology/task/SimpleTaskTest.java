package ru.netology.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTaskTest {
    @Test
            public void testGetTitle(){
        SimpleTask simpleTask = new SimpleTask(54, "Купить торт");
        String expected = "Купить торт";
        String actual = simpleTask.getTitle();
        Assertions.assertEquals(actual, expected);
    }


}