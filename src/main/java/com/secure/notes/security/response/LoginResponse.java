package com.secure.notes.security.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LoginResponse {

    private String jwtToken;
    private String username;
    private List<String> roles;

    public LoginResponse(String jwtToken,  List<String> roles, String username) {
        this.jwtToken = jwtToken;
        this.roles = roles;
        this.username = username;

    }
}
