package com.jwt.JwtTest.configuration;

public class JwtResponse {
    
    private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}



}
