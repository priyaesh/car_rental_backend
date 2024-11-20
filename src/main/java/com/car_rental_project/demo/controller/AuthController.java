package com.car_rental_project.demo.controller;

import com.car_rental_project.demo.dto.SignupRequest;
import com.car_rental_project.demo.dto.UserDto;
import com.car_rental_project.demo.services.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest){
        UserDto createdCustomerDto = authService.createCustomer(signupRequest);
        if(createdCustomerDto == null) return new ResponseEntity<>(
                "Customer not created, Come again later", HttpStatus.BAD_REQUEST);
        return  new ResponseEntity<>(createdCustomerDto,HttpStatus.CREATED);

    }
}
