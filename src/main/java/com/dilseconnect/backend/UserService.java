package com.dilseconnect.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userrepo;

    @Autowired
    public UserService(UserRepo userrepo) {
        this.userrepo = userrepo;
    }

    public List<User> printAll(){
        return userrepo.findAll();
    }
    public void saveUser(User user){
        userrepo.save(user);
    }
}
