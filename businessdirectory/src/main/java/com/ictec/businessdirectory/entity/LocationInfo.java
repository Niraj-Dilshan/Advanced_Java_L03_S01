package com.ictec.businessdirectory.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationInfo {
    @JsonProperty("Lan")
    private String lan;

    @JsonProperty("Lat")
    private String lat;

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "LocationInfo{" +
                "lan='" + lan + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }
}
