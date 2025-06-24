package com.flowalp.event.controller;

import com.flowalp.event.dto.AssignmentDTO;
import com.flowalp.event.service.AssignmentService;
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
public class AssignmentController {

  private final AssignmentService assignmentService;
  private static final String ASSIGNMENT_PATH = "assignment";

  @PostMapping(ASSIGNMENT_PATH + "/create")
  public ResponseEntity<AssignmentDTO> create(@RequestBody AssignmentDTO assignmentDTO) {
    return new ResponseEntity<>(assignmentService.create(assignmentDTO), HttpStatus.OK);
  }
}
