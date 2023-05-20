package com.ictech.springbootworkshop.controller;

import org.springframework.stereotype.Controller;

@Controller
public class AuthController {
    public String doLogin() {
        return "login";
    }
}
