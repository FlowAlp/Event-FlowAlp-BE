package com.flowalp.event.controller;

import com.flowalp.event.dto.ConfigurationDTO;
import com.flowalp.event.service.ConfigurationService;
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
public class ConfigurationController {

  private final ConfigurationService configurationService;
  private static final String CONFIGURATION_PATH = "configuration";

  @PostMapping(CONFIGURATION_PATH + "/create")
  public ResponseEntity<ConfigurationDTO> create(@RequestBody ConfigurationDTO configurationDTO) {
    return new ResponseEntity<>(configurationService.create(configurationDTO), HttpStatus.OK);
  }
}
