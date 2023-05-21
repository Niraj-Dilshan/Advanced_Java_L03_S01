package com.ictec.businessdirectory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressInfo {
    @JsonProperty("Line1")
    private String line1;

    @JsonProperty("Line2")
    private String line2;

    @JsonProperty("State")
    private String state;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressInfo{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
