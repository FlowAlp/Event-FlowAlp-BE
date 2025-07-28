package com.flowalp.event.controller;

import com.flowalp.event.dto.TagUserAssociationDTO;
import com.flowalp.event.service.TagUserAssociationService;
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
public class TagUserAssociationController {

  private final TagUserAssociationService tagUserAssociationService;
  private static final String TAG_USER_ASSOCIATION_PATH = "tag-user-association";

  @PostMapping(TAG_USER_ASSOCIATION_PATH + "/create")
  public ResponseEntity<TagUserAssociationDTO> create(@RequestBody TagUserAssociationDTO tagUserAssociationDTO) {
    return new ResponseEntity<>(tagUserAssociationService.create(tagUserAssociationDTO), HttpStatus.OK);
  }
}
