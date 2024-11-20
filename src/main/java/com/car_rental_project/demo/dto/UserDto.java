package com.car_rental_project.demo.dto;

import com.car_rental_project.demo.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;

    private  String name;

    private  String email;

    private UserRole userRole;

}
