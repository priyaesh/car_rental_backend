package com.car_rental_project.demo.services.auth;

import com.car_rental_project.demo.dto.SignupRequest;
import com.car_rental_project.demo.dto.UserDto;
import com.car_rental_project.demo.entity.User;
import com.car_rental_project.demo.enums.UserRole;
import com.car_rental_project.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {
      User user = new User();
      user.setName(signupRequest.getName());
      user.setEmail(signupRequest.getEmail());
      user.setPassword(signupRequest.getPassword());
      user.setUserRole(UserRole.CUSTOMER);
      User createUser= userRepository.save(user);
      UserDto userDto= new UserDto();
      userDto.setId(createUser.getId());
      return userDto;
    }


}
