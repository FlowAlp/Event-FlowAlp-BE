package com.flowalp.event.controller;

import com.flowalp.event.dto.EventDTO;
import com.flowalp.event.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.url}")
public class EventController {

  private final EventService eventService;
  private static final String EVENT = "event";

  @PostMapping(EVENT + "/create")
  public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO) {
    return new ResponseEntity<>(eventService.createEvent(eventDTO), HttpStatus.OK);
  }

  @GetMapping(EVENT + "/get/{secureId}")
  public ResponseEntity<EventDTO> getEvent(@PathVariable String secureId) {
    return ResponseEntity.ok(eventService.getEvent(secureId));
  }
}
