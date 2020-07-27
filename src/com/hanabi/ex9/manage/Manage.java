package com.hanabi.ex9.manage;

import com.hanabi.ex9.student.Student;

import java.util.ArrayList;

public class Manage {

    ArrayList<Student> students;

    public Manage(ArrayList<Student> students) {
        this.students = students;
    }

    public void showAll(){
        for (Student student : students) {
            student.toString();
        }
    }
}
