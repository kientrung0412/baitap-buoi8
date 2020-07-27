package com.hanabi.ex6.hotell;

import com.hanabi.ex6.tenant.Tenant;

import java.util.ArrayList;

public class Hottel {

    private ArrayList<Tenant> tenants;

    public Hottel(ArrayList<Tenant> tenants) {
        this.tenants = tenants;
    }

    public void show() {
        for (Tenant tenant : tenants) {
            tenant.showAll();
        }
    }

}
