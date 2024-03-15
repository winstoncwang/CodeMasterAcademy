package com.codemaster.academy.controller;

import com.codemaster.academy.dto.RegistrationRequest;
import com.codemaster.academy.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegistrationRequest registrationRequest) {
        authenticationService.registerUser(registrationRequest);
        return ResponseEntity.ok("User registered successfully");
    }

//    @PostMapping("/login")
//    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
//        String token = authenticationService.loginUser(loginRequest);
//        return ResponseEntity.ok(new AuthenticationResponse(token));
//    }
//
//    @PostMapping("/logout")
//    public ResponseEntity<?> logoutUser(HttpServletRequest request) {
//        authenticationService.logoutUser(request);
//        return ResponseEntity.ok("User logged out successfully");
//    }
//
//    @PostMapping("/reset-password")
//    public ResponseEntity<?> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
//        authenticationService.resetPassword(resetPasswordRequest);
//        return ResponseEntity.ok("Password reset successfully");
//    }
}
