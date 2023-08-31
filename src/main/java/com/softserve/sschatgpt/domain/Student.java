package com.softserve.sschatgpt.domain;

public class Student {
    private String name;
    private int age;
    private int grade;
    private boolean exceptional;
    private boolean honorRoll;
    private boolean passed;

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter for grade
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Getter and setter for exceptional
    public boolean isExceptional() {
        return exceptional;
    }

    public void setExceptional(boolean exceptional) {
        this.exceptional = exceptional;
    }

    // Getter and setter for honorRoll
    public boolean isHonorRoll() {
        return honorRoll;
    }

    public void setHonorRoll(boolean honorRoll) {
        this.honorRoll = honorRoll;
    }

    // Getter and setter for passed
    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
