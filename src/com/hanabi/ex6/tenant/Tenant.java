package com.hanabi.ex6.tenant;

import com.hanabi.ex6.human.Human;

public class Tenant extends Human {

    private int numDays;
    private int typeRoom;

    public Tenant(String name, short age, short birth, String humanId, int numDays, int typeRoom) {
        super(name, age, birth, humanId);
        this.numDays = numDays;
        this.typeRoom = typeRoom;
    }

}
