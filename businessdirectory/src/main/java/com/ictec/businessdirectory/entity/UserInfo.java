package com.ictec.businessdirectory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "User")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("Name")
    private String name;

    @OneToOne (cascade = CascadeType.ALL)
    @JsonProperty("Address")
    private AddressInfo address;

    @JsonProperty("Number")
    private String number;

    @OneToOne (cascade = CascadeType.ALL)
    @JsonProperty("Location")
    private LocationInfo location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressInfo getAddress() {
        return address;
    }

    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocationInfo getLocation() {
        return location;
    }

    public void setLocation(LocationInfo location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
