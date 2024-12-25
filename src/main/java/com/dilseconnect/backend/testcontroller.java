package com.dilseconnect.backend;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "royal randwa"+ request.getSession().getId();
    }
}
