package com.flowalp.event.controller;

import com.flowalp.event.dto.UserFieldsDTO;
import com.flowalp.event.service.UserFieldsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.url}")
@CrossOrigin
public class UserFieldsController {

  private final UserFieldsService userFieldsService;
  private static final String USER_FIELDS_PATH = "user-fields";

  @PostMapping(USER_FIELDS_PATH + "/create")
  public ResponseEntity<UserFieldsDTO> create(@RequestBody UserFieldsDTO userFieldsDTO) {
    return new ResponseEntity<>(userFieldsService.create(userFieldsDTO), HttpStatus.OK);
  }
}
