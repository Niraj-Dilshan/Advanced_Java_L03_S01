package com.ictec.businessdirectory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserInfo {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("Address")
    private List<AddressInfo> address;

    @JsonProperty("Number")
    private String number;

    @JsonProperty("Location")
    private List<LocationInfo> location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddressInfo> getAddress() {
        return address;
    }

    public void setAddress(List<AddressInfo> address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<LocationInfo> getLocation() {
        return location;
    }

    public void setLocation(List<LocationInfo> location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", number='" + number + '\'' +
                ", location=" + location +
                '}';
    }
}
