package com.ictech.dpatterns;

public class SimpleNameClass implements SimpleNameInterface{
    private String name;

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String getname() {
        return name;
    }
}
