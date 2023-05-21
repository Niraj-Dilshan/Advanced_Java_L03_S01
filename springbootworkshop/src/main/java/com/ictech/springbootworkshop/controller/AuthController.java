package com.ictech.springbootworkshop.controller;

import com.ictech.springbootworkshop.entity.LoginEntity;
import com.ictech.springbootworkshop.entity.UserRepository;
import com.ictech.springbootworkshop.entity.Users;
import com.ictech.springbootworkshop.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final LoginService loginService;

    @Autowired
    public AuthController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> doRegister(@RequestBody LoginEntity loginEntity) {
        // Perform registration logic here
        return ResponseEntity.ok(loginEntity.toString());
    }

    @PostMapping("/lan/{language}/login")
    public ResponseEntity<String> doLogin(@PathVariable String language, @RequestBody LoginEntity loginEntity) {
        // Perform login logic here
        if (loginEntity.getEmail().equals("infnity@gmail.com") && loginEntity.getPassword().equals("12345678")) {
            return ResponseEntity.ok(language + " " + loginEntity.toString());
        } else {
            return ResponseEntity.badRequest().body("Invalid email or password");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Users user) {
        String username = user.getUsername();
        String password = user.getPassword();

        // Validate user credentials using LoginService and UserRepository
        loginService.validateLogin(username, password).hasBody();
    }
}

