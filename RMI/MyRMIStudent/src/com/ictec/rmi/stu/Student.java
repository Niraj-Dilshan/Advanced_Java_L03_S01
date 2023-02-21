package com.ictec.rmi.stu;

import java.io.Serializable;

public class Student implements Serializable {
    private String stu_id;
    private String stu_name;

    private String stu_address;

    public String getId() {
        return stu_id;
    }

    public void setId(String id) {
        this.stu_id = id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_address() {
        return stu_address;
    }

    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }
}
