package com.project.hawkezx.controller;

import com.project.hawkezx.dto.request.UserRequestDTO;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
@Validated
public class UserController {

    @GetMapping("/getUser/{userId}")
    public String getUser(@PathVariable int userId) {
        return "User with id" + " " +  userId + " " +  "added successfully" ;
    }

    @PostMapping("/createUser")
    public String createUser(@Valid @RequestBody UserRequestDTO userRequestDTO) {
        return "User created successfully with name: " + userRequestDTO.toString();
    }

    @PatchMapping("/updateUser/{userId}")
    public String updateUser(@RequestParam( name = "User's status") boolean status,
                             @PathVariable int userId) {
        return "User with id " + userId +  " updated successfully: Changed status: " + status ;
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return "User with id " + userId + " deleted successfully";
    }
}
