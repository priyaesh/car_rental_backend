package com.car_rental_project.demo.services.auth;

import com.car_rental_project.demo.dto.SignupRequest;
import com.car_rental_project.demo.dto.UserDto;


public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);
}
