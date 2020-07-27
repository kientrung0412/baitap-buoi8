package com.hanabi;

import com.hanabi.ex6.hotell.Hottel;
import com.hanabi.ex6.tenant.Tenant;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Tenant> tenants = new ArrayList<>();
        tenants.add(new Tenant("Trung", (short) 18, (short) 2000, "1545454564545", 10, 1));
        tenants.add(new Tenant("Trung", (short) 20, (short) 2000, "1545454564545", 10, 1));
        tenants.add(new Tenant("Trung", (short) 21, (short) 2000, "1545454564545", 10, 1));

        Hottel hottel = new Hottel(tenants);
        hottel.show();

    }
}
