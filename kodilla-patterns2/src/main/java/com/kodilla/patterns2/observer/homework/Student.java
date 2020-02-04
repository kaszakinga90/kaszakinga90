package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Student implements Observable {
    private final String username;
    private final List<Observer> observers;
    private Map<String, String> tasks;
    private final Courses course;

    public Student(String username, Courses course) {
        this.username = username;
        observers = new ArrayList<>();
        tasks = new LinkedHashMap<>();
        this.course = course;
    }

    public void addTask(String taskId, String reply) {
        tasks.put(taskId, reply);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getUsername() {
        return username;
    }

    public Map<String, String> getTasks() {
        return tasks;
    }

    public Courses getCourse() {
        return course;
    }
}
