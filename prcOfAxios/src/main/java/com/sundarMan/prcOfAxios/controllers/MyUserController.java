package com.sundarMan.prcOfAxios.controllers;

import com.sundarMan.prcOfAxios.model.MyUser;
import com.sundarMan.prcOfAxios.services.MyUserService;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:2716")
public class MyUserController {

    private final MyUserService myUserService;

    public MyUserController(MyUserService myUserService) {
        this.myUserService = myUserService;
    }


    @PostMapping("/registerUser")
    public ResponseEntity<?> registerUserByC(@RequestBody MyUser myUser){
        MyUser regUser=myUserService.regUser(myUser);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(regUser);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<?> getAll()
    {
        List<MyUser> myUsers=myUserService.getAllByS();
        if(myUsers.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No User In List...");
        }else{
            return ResponseEntity.status(HttpStatus.OK)
                    .body(myUsers);
        }
    }

}
