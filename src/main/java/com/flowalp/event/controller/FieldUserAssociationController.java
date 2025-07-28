package com.flowalp.event.controller;

import com.flowalp.event.dto.FieldUserAssociationDTO;
import com.flowalp.event.service.FieldUserAssociationService;
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
public class FieldUserAssociationController {

  private final FieldUserAssociationService fieldUserAssociationService;
  private static final String FIELD_USER_ASSOCIATION_PATH = "field-user-association";

  @PostMapping(FIELD_USER_ASSOCIATION_PATH + "/create")
  public ResponseEntity<FieldUserAssociationDTO> create(@RequestBody FieldUserAssociationDTO fieldUserAssociationDTO) {
    return new ResponseEntity<>(fieldUserAssociationService.create(fieldUserAssociationDTO), HttpStatus.OK);
  }
}
