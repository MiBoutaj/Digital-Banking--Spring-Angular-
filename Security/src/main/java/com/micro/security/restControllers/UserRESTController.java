package com.micro.security.restControllers;

import java.util.List;

import com.micro.security.entities.User;
import com.micro.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
public class UserRESTController {

    @Autowired
    UserService userService;

    @RequestMapping(path="all",method=RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }



}