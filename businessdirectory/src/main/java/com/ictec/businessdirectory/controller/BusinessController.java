package com.ictec.businessdirectory.controller;

import com.ictec.businessdirectory.entity.AddressInfo;
import com.ictec.businessdirectory.entity.LocationInfo;
import com.ictec.businessdirectory.entity.UserInfo;
import com.ictec.businessdirectory.repo.UserInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Controller
@RequestMapping("/api")
public class BusinessController {

    @Autowired
    private UserInfoRepo userInfoRepo;

    @PostMapping("/business")
    public ResponseEntity<String> doBusiness(@RequestBody UserInfo userInfo) {
        return ResponseEntity.ok(userInfo.toString());
    }

    @GetMapping("/getjsonformat")
    public ResponseEntity<UserInfo> doBusiness() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("John");
        userInfo.setNumber("1234567890");

        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setLine1("Line 1");
        addressInfo.setLine2("Line 2");
        addressInfo.setState("State");

        userInfo.setAddress(addressInfo);

        LocationInfo locationInfo = new LocationInfo();
        locationInfo.setLan("Lan");
        locationInfo.setLat("Lat");

        userInfo.setLocation(locationInfo);

        return ResponseEntity.ok().contentType(APPLICATION_JSON).body(userInfo);
    }

    @PostMapping("/businesssave")
    public ResponseEntity<UserInfo> doBusinessSave(@RequestBody UserInfo userInfo) {
        userInfoRepo.save(userInfo);
        return ResponseEntity.ok().body(userInfo);
    }

    @RequestMapping(value = "/showbusinesses", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserInfo>> getAllUsers() {
        List<UserInfo> users = userInfoRepo.findAll();
        return ResponseEntity.ok(users);
    }

    @RequestMapping(value = "/showbusinesses/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserInfo> getUserById(@PathVariable(value = "id") Long userId) {
        UserInfo userInfo = userInfoRepo.findById(userId).get();
        return ResponseEntity.ok(userInfo);
    }

    @RequestMapping(value = "/showbusinesses/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteUserById(@PathVariable(value = "id") Long userId) {
        userInfoRepo.deleteById(userId);
        return ResponseEntity.ok("User deleted successfully");
    }

    @RequestMapping(value = "/showbname/{search}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserInfo>> getUsersByName(@PathVariable(value = "search") String search) {
        List<UserInfo> users = userInfoRepo.findByNameEndingWith(search);
        return ResponseEntity.ok(users);
    }

}
