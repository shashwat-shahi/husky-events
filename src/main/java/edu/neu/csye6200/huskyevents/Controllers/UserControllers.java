package edu.neu.csye6200.huskyevents.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.neu.csye6200.huskyevents.Entities.User;
import edu.neu.csye6200.huskyevents.Services.UserServices;

@RestController
@RequestMapping("/users")
public class UserControllers {

    @Autowired
    UserServices userServices;

    // Create
    @PostMapping("/createUser")
    public ResponseEntity<User> Createuser(@RequestBody User user){
        return new ResponseEntity<>(userServices.createUser(user), HttpStatus.OK);
    }

    // Read
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> GetAllusers(){
        return new ResponseEntity<>(userServices.getAllUsers(), HttpStatus.OK);
    }
}
