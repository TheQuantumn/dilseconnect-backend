package com.dilseconnect.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    private List<User> users = new ArrayList<>(List.of(
            new User(1,"Ram",19),
            new User(2,"Shyam",20)
            ));
    @GetMapping("/users")
    public List<User> getUsers(){
        return users;
    }
}
