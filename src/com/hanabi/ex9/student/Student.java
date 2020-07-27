package com.hanabi.ex9.student;

import com.hanabi.ex6.human.Human;

public class Student {

    private String name;
    private String className;
    private short age;
    private short birth;

    public Student(String name, String className, short age, short birth) {
        this.name = name;
        this.className = className;
        this.age = age;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }
}
