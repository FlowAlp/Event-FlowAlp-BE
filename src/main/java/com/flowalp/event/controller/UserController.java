package com.flowalp.event.controller;

import com.flowalp.event.dto.UserDTO;
import com.flowalp.event.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.url}")
@CrossOrigin
public class UserController {

  private final UserService userService;
  private static final String USER_PATH = "user";

  @PostMapping(USER_PATH + "/create")
  public ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO) {
    return new ResponseEntity<>(userService.create(userDTO), HttpStatus.OK);
  }

  @GetMapping("/hello")
  @PreAuthorize("hasRole('user')")
  public String hello() { return "Hello secured world!"; }

}
