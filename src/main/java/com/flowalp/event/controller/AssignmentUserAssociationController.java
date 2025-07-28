package com.flowalp.event.controller;

import com.flowalp.event.dto.AssignmentUserAssociationDTO;
import com.flowalp.event.service.AssignmentUserAssociationService;
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
public class AssignmentUserAssociationController {

  private final AssignmentUserAssociationService assignmentUserAssociationService;
  private static final String ASSIGNMENT_USER_ASSOCIATION_PATH = "assignment-user-association";

  @PostMapping(ASSIGNMENT_USER_ASSOCIATION_PATH + "/create")
  public ResponseEntity<AssignmentUserAssociationDTO> create(@RequestBody AssignmentUserAssociationDTO assignmentUserAssociationDTO) {
    return new ResponseEntity<>(assignmentUserAssociationService.create(assignmentUserAssociationDTO), HttpStatus.OK);
  }
}
