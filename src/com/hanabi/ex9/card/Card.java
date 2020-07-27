package com.hanabi.ex9.card;

import com.hanabi.ex9.student.Student;

import java.util.Date;

public class Card {

    private Student student;
    private String cardId;
    private Date satarDate;
    private byte day;
    private String bookId;

    public Card(Student student, String cardId, Date satarDate, byte day, String bookId) {
        this.student = student;
        this.cardId = cardId;
        this.satarDate = satarDate;
        this.day = day;
        this.bookId = bookId;
    }
}
