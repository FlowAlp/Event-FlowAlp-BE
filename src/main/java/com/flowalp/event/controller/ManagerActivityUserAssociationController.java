package com.flowalp.event.controller;

import com.flowalp.event.dto.ManagerActivityUserAssociationDTO;
import com.flowalp.event.service.ManagerActivityUserAssociationService;
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
public class ManagerActivityUserAssociationController {

  private final ManagerActivityUserAssociationService managerActivityUserAssociationService;
  private static final String MANAGER_ACTIVITY_USER_ASSOCIATION_PATH = "manager-activity-user-association";

  @PostMapping(MANAGER_ACTIVITY_USER_ASSOCIATION_PATH + "/create")
  public ResponseEntity<ManagerActivityUserAssociationDTO> create(@RequestBody ManagerActivityUserAssociationDTO managerActivityUserAssociationDTO) {
    return new ResponseEntity<>(managerActivityUserAssociationService.create(managerActivityUserAssociationDTO), HttpStatus.OK);
  }
}
