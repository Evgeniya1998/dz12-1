package ru.netology.task;

import ru.netology.task.Task;

public class SimpleTask extends Task {


    public SimpleTask(int id, String title) {
        super(id);
        this.title = title;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        return title.contains(query);
    }

}




