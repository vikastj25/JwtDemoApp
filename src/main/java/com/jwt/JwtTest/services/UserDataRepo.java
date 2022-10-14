package com.jwt.JwtTest.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.JwtTest.entity.UserData;

@Repository
public interface UserDataRepo extends JpaRepository<UserData, Integer> {
    
        public UserData findByUsername(String name);

}
