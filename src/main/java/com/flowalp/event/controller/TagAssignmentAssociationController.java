package com.flowalp.event.controller;

import com.flowalp.event.dto.TagAssignmentAssociationDTO;
import com.flowalp.event.service.TagAssignmentAssociationService;
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
public class TagAssignmentAssociationController {

  private final TagAssignmentAssociationService tagAssignmentAssociationService;
  private static final String TAG_ASSIGNMENT_ASSOCIATION_PATH = "tag-assignment-association";

  @PostMapping(TAG_ASSIGNMENT_ASSOCIATION_PATH + "/create")
  public ResponseEntity<TagAssignmentAssociationDTO> create(@RequestBody TagAssignmentAssociationDTO tagAssignmentAssociationDTO) {
    return new ResponseEntity<>(tagAssignmentAssociationService.create(tagAssignmentAssociationDTO), HttpStatus.OK);
  }
}
