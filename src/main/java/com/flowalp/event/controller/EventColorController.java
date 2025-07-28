package com.flowalp.event.controller;

import com.flowalp.event.dto.EventColorDTO;
import com.flowalp.event.service.EventColorService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.url}")
public class EventColorController {

  private final EventColorService eventColorService;
  private static final String EVENT_COLOR = "event-color";

  @GetMapping(EVENT_COLOR + "/get-all-by-event/{eventId}")
  public ResponseEntity<List<EventColorDTO>> getColorByEvent(@PathVariable String eventId) {
    return new ResponseEntity<>(eventColorService.findAllByEvent(eventId), HttpStatus.OK);
  }
}
