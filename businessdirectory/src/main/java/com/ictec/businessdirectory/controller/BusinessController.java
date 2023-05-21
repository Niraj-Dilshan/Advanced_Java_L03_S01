package com.ictec.businessdirectory.controller;

import com.ictec.businessdirectory.entity.AddressInfo;
import com.ictec.businessdirectory.entity.LocationInfo;
import com.ictec.businessdirectory.entity.UserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Controller
@RequestMapping("/api")
public class BusinessController {
    @PostMapping("/business")
    public ResponseEntity<String> doBusiness(@RequestBody UserInfo userInfo) {
        return ResponseEntity.ok(userInfo.toString());
    }

    @GetMapping("/showbusiness")
    public ResponseEntity<UserInfo> doBusiness() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("John");
        userInfo.setNumber("1234567890");

        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setLine1("Line 1");
        addressInfo.setLine2("Line 2");
        addressInfo.setState("State");

        List<AddressInfo> addressList = new ArrayList<>();
        addressList.add(addressInfo);
        userInfo.setAddress(addressList);

        LocationInfo locationInfo = new LocationInfo();
        locationInfo.setLan("Lan");
        locationInfo.setLat("Lat");

        List<LocationInfo> locationList = new ArrayList<>();
        locationList.add(locationInfo);
        userInfo.setLocation(locationList);

        return ResponseEntity.ok().contentType(APPLICATION_JSON).body(userInfo);
    }

    @PostMapping("/businesssave")
    public ResponseEntity<UserInfo> doBusinessSave(@RequestBody UserInfo userInfo) {
        return ResponseEntity.ok().body(userInfo);
    }
}
