package com.hanabi.ex7.manage;

import com.hanabi.ex7.student.Student;

import java.util.ArrayList;

public class Manage {

    ArrayList<Student> students = new ArrayList<>();

    public Manage(ArrayList<Student> students) {
        this.students = students;
    }

    public void findBirth1985(){
        for (Student student : students) {
            if (student.getBirth() == 1985){
                student.showAll();
            }
        }
    }

    public void findBirthAndAddress(){
        for (Student student : students) {
            if (student.getBirth() == 1985 && student.getAddress().equalsIgnoreCase("thái nguyên")){
                student.showAll();
            }
        }
    }
}
