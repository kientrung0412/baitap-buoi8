package com.hanabi.ex7.student;

import com.hanabi.ex6.human.Human;

public class Student extends Human {

    private String address;
    private String className;
    private String course;
    private byte semester;

    public String getAddress() {
        return address;
    }



    public Student(String name, short age, short birth, String humanId, String address, String className, String course, byte semester) {
        super(name, age, birth, humanId);
        this.address = address;
        this.className = className;
        this.course = course;
        this.semester = semester;
    }

    public void showAll(){

        System.out.println("Tên: " + getName());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Năm sinh: " + getBirth());
        System.out.println("Địa chỉ: " + address);
        System.out.println("Lớp: " + className);
        System.out.println("Ngành học: " + course);
        System.out.println("Học kỳ: " + semester);

    }
}
