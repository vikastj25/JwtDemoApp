package com.jwt.JwtTest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.JwtTest.entity.UserData;
import com.jwt.JwtTest.services.UserDataService;

@RestController
@RequestMapping("/userData")
public class UserDataController {
    
    @Autowired
    private UserDataService userDataService;


    @PostMapping("/save")
    public ResponseEntity<?> saveUserData(@RequestBody UserData userData){
        UserData saveUserData = userDataService.saveUserData(userData);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveUserData);
    }


    @GetMapping("/allData")
    public ResponseEntity<?> allUserData(){
        List<UserData> allUserData = userDataService.allUserData();
        return ResponseEntity.status(HttpStatus.OK).body(allUserData);
    }
  
    @GetMapping("/test")
    public List<String> allUserDatas(){


        List<String> arrayList = new ArrayList<>();
        arrayList.add("Vikas");
        arrayList.add("Roy");
        arrayList.add("Shivam");
        arrayList.add("Roy");
        return arrayList;
    }



}
