package com.ictech.dpatterns;

public class SimpleToComplexAdaptor implements ComplexNameInterface{
    //this must handle the client request and this mush convert the client request to backend requirements/requests

    SimpleNameClass sn = new SimpleNameClass();

    public SimpleToComplexAdaptor(SimpleNameClass sn) {
        this.sn = sn;
        this.fname = sn.getname().split(" ")[0];
        this.lname = sn.getname().split(" ")[1];
    }

    private String fname, lname;
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
