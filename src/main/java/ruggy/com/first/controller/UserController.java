package ruggy.com.first.controller;

import javax.persistence.Entity;

import org.apache.catalina.User;
import ruggy.com.first.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ruggy.com.first.user.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping(path = {"ruggy","jarred","noway"},method = {RequestMethod.GET})

    public String ruggy(){
        return "This is Jaston Ruggy";
    }

    @RequestMapping(path="user",method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userRepository.save(null);
    }
}
