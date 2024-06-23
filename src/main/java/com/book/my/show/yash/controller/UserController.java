package com.book.my.show.yash.controller;

import com.book.my.show.yash.dto.ResponseDto;
import com.book.my.show.yash.dto.UserDto;
import com.book.my.show.yash.entity.User;
import com.book.my.show.yash.service.UserService;
import com.book.my.show.yash.util.JwtUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "Users API", description = "API for managing users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    PasswordEncoder passwordEncoder;

    public ModelMapper modelMapper = new ModelMapper();

    @GetMapping("/{id}")
    public User findATicket(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @PostMapping("/register")
    public ResponseEntity<ResponseDto> register(@RequestBody UserDto userDto) {
        User user = modelMapper.map(userDto,User.class);
        User savedUser = userService.save(user);
        ResponseDto responseDto = ResponseDto.builder().dataObject("User registered successfully")
                .build();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<ResponseDto> createAuthenticationToken(@RequestBody UserDto userDto) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(userDto.getUserName(), userDto.getPassword())
            );
        } catch (Exception e) {
            ResponseDto responseDto = ResponseDto.builder().dataObject(e.getMessage()).build();
            return new ResponseEntity<>(responseDto, HttpStatus.FORBIDDEN);
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(userDto.getUserName());

        final String jwt = jwtUtil.generateToken(userDetails.getUsername());
        ResponseDto responseDto = ResponseDto.builder().dataObject(jwt).build();
        System.out.println("JWT token generated for username "+userDto.getUserName());
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
}
