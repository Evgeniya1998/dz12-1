package ru.netology.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpicTest {
    @Test
    public void testGetSubtasks() {
        Epic epic = new Epic(54, new String[]{"Купить торт"});
        String[] expected = {"Купить торт"};
        String[] actual = epic.getSubtasks();
        Assertions.assertArrayEquals(actual, expected);


    }
}