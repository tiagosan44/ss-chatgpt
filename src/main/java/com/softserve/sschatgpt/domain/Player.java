package com.softserve.sschatgpt.domain;

import java.util.List;

public class Player {

    private String name;
    private int age;
    private int experience;
    private List<Integer> skills;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for experience
    public int getExperience() {
        return experience;
    }

    // Setter for experience
    public void setExperience(int experience) {
        this.experience = experience;
    }

    // Getter for skills
    public List<Integer> getSkills() {
        return skills;
    }

    // Setter for skills
    public void setSkills(List<Integer> skills) {
        this.skills = skills;
    }
}