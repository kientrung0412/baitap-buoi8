package com.hanabi.ex8.teacher;

import com.hanabi.ex6.human.Human;

public class Teacher extends Human {

    private int salary;
    private int bonus;
    private int forfeit;
    private int trueSalary;

    public Teacher(String name, short age, short birth, String humanId, int salary, int bonus, int forfeit) {
        super(name, age, birth, humanId);
        this.salary = salary;
        this.bonus = bonus;
        this.forfeit = forfeit;
        this.trueSalary = salary + bonus - forfeit;
    }

    public void show(){

        System.out.println("Tên: " + getName());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Năm sinh: " + getBirth());

    }
}
