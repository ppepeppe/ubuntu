package com.example.back2.controller;


import com.example.back2.dto.request.UserRequest;
import com.example.back2.dto.response.UserResponse;
import com.example.back2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")


public class MainController {
    private final UserService userService;
    @CrossOrigin(origins = {"http://localhost:8080/", "http://localhost:8082/"})

    @PostMapping("/hello")
    public ResponseEntity<?> getName(@RequestBody UserRequest userRequest){
        try {
            String userNm = userService.getName(userRequest.getUserId());
            return new ResponseEntity<> (new UserResponse(userNm), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<> ("fail", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
