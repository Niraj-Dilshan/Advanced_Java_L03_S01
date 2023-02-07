package com.ictech.dpatterns;

public class ComplexNameClass implements ComplexNameInterface{

    private String fname,lname;

    @Override
    public void setfname(String fname) {
        this.fname = fname;
    }

    @Override
    public String getfname() {
        return fname;
    }

    @Override
    public void setlname(String lname) {
        this.lname = lname;
    }

    @Override
    public String getlname() {
        return lname;
    }
}
