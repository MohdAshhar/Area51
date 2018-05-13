package com.area51.controller;


import com.area51.model.Users;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("parents")
public class UserController {


    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public ResponseEntity<Void> saveUser(@RequestBody Users user) {
        /*List<PortfolioUser> userList = null;
        if (user.getId() == null) {
            userList = userService.getUserListByNameOrEmail(user.getName(), user.getEmail());
            if (userList.size() == 0) {
                BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                user.setPassword(passwordEncoder.encode(user.getPassword()));
                user.setCreateDate(new Date());
                userRepository.save(user);
                return new ResponseEntity(HttpStatus.CREATED);
            } else {
                return new ResponseEntity(HttpStatus.RESET_CONTENT);
            }
        } else {
            userList = userService.getUserListByNameOrEmail(user.getName(), user.getEmail());

            if (userList.size() != 0 && userList != null) {
                PortfolioUser checkUser = userList.get(0);
                if (userList.size() <= 1 && (checkUser.getId().equals(user.getId()))) {
                    userRepository.save(user);
                    return new ResponseEntity(HttpStatus.CREATED);
                } else {
                    return new ResponseEntity(HttpStatus.RESET_CONTENT);
                }
            } else {
                userRepository.save(user);
                return new ResponseEntity(HttpStatus.CREATED);
            }*/
        return new ResponseEntity(HttpStatus.CREATED);

    }


}

