package com.example.srinifire;

import java.util.Date;

public class SSS {
    String name;
    String reg;
    String route;
    String date;
    String id;
    String seat;
    public SSS()
    {

    }

    public SSS(String id,String name, String reg, String route, String date,String seat) {
        this.name = name;
        this.reg = reg;
        this.route = route;
        this.date = date;
        this.id=id;
        this.seat=seat;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSeat() {
        return seat;
    }

    public String getReg() {
        return reg;
    }

    public String getRoute() {
        return route;
    }

    public String  getDate() {
        return date;
    }
}
