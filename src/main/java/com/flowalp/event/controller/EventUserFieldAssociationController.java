package com.flowalp.event.controller;

import com.flowalp.event.dto.EventUserFieldAssociationDTO;
import com.flowalp.event.service.EventUserFieldAssociationService;
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
public class EventUserFieldAssociationController {

  private final EventUserFieldAssociationService eventUserFieldAssociationService;
  private static final String EVENT_USER_FIELD_ASSOCIATION_PATH = "event-user-field-association";

  @PostMapping(EVENT_USER_FIELD_ASSOCIATION_PATH + "/create")
  public ResponseEntity<EventUserFieldAssociationDTO> create(@RequestBody EventUserFieldAssociationDTO eventUserFieldAssociationDTO) {
    return new ResponseEntity<>(eventUserFieldAssociationService.create(eventUserFieldAssociationDTO), HttpStatus.OK);
  }
}
