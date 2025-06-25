package com.flowalp.event.controller;

import com.flowalp.event.dto.TagActivityAssociationDTO;
import com.flowalp.event.service.TagActivityAssociationService;
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
public class TagActivityAssociationController {

  private final TagActivityAssociationService tagActivityAssociationService;
  private static final String TAG_ACTIVITY_ASSOCIATION_PATH = "tag-activity-association";

  @PostMapping(TAG_ACTIVITY_ASSOCIATION_PATH + "/create")
  public ResponseEntity<TagActivityAssociationDTO> create(@RequestBody TagActivityAssociationDTO tagActivityAssociationDTO) {
    return new ResponseEntity<>(tagActivityAssociationService.create(tagActivityAssociationDTO), HttpStatus.OK);
  }
}
