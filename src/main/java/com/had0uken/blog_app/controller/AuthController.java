package com.had0uken.blog_app.controller;

import com.had0uken.blog_app.repository.RoleRepository;
import com.had0uken.blog_app.repository.UserRepository;
import com.had0uken.blog_app.request.LoginPasswordRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

   /* public ResponseEntity<?> authUser(@RequestBody LoginPasswordRequest request) {

    }*/

}
