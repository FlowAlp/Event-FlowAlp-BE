package com.flowalp.event.controller;

import com.flowalp.event.dto.ActivityDTO;
import com.flowalp.event.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.url}")
public class ActivityController {

  private final ActivityService activityService;
  private static final String ACTIVITY_PATH = "activity";

  @PostMapping(ACTIVITY_PATH + "/create")
  public ResponseEntity<ActivityDTO> create(@RequestBody ActivityDTO activityDTO) {
    return new ResponseEntity<>(activityService.create(activityDTO), HttpStatus.OK);
  }
}
