package com.jwt.JwtTest.configuration;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.JwtTest.entity.UserData;
import com.jwt.JwtTest.services.UserDataService;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
    private UserDataService userDataService;

    @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserData findByUsername = userDataService.gettingData(username);

		if ((findByUsername.getUsername()).equals(username)) {
			return new User(findByUsername.getUsername(), findByUsername.getPassword(), new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
    


}
