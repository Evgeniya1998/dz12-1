package ru.netology.task;

import ru.netology.task.Task;

public class Meeting extends Task {
    public Meeting(int id, String topik, String project, String start) {
        super(id);
        this.topik = topik;
        this.project = project;
        this.start = start;
    }

    private String topik;
    private String project;
    private String start;

    public String getTopik() {
        return topik;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }
    public boolean matches(String query) {
        if (topik.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}
