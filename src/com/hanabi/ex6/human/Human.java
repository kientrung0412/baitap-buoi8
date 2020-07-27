package com.hanabi.ex6.human;

public class Human {

    private String name;
    private short age;
    private short birth;
    private String humanId;

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public short getBirth() {
        return birth;
    }

    public String getHumanId() {
        return humanId;
    }

    public Human(String name, short age, short birth, String humanId) {
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.humanId = humanId;
    }

    public void showAll(){

        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Năm sinh: " + birth);
        System.out.println("Số cmtnd: " + humanId);

    }
}
