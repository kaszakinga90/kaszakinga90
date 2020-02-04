package com.kodilla.patterns2.observer.homework;

import java.util.Map;

public class Mentor implements Observer {
    private final String mentor;
    private int updateCount;

    public Mentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public void update(Student student) {
        Map<String, String> task = student.getTasks();
        String lastKey = "";
        for (String entry : task.keySet()) {
            lastKey=entry;
        }

        StringBuilder xyz = new StringBuilder();
        xyz.append("Student: ");
        xyz.append(student.getUsername() + "\n");
        xyz.append("from this course: ");
        xyz.append(student.getCourse() + "\n");
        xyz.append("send new task to check: ");
        xyz.append(lastKey);
        System.out.println(xyz + "\n");
        updateCount++;
    }

    public String getMentor() {
        return mentor;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
