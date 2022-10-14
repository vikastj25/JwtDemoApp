package com.jwt.JwtTest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.JwtTest.entity.UserData;

@Service
public class UserDataService {

    @Autowired
    private UserDataRepo userDataRepo;

    // saving user data !!!!!!!!!!!
    public UserData saveUserData(UserData userData) {
        return userDataRepo.save(userData);
    }

    // fetching all user data!!!!!!!!!!!!!
    public List<UserData> allUserData() {
        return userDataRepo.findAll();
    }

    public UserData gettingData(String username) {
        return userDataRepo.findByUsername(username);
    }

}
