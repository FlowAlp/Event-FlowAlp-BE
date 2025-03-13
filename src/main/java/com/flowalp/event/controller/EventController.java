package com.flowalp.event.controller;

import com.flowalp.event.dto.EventDTO;
import com.flowalp.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController {
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/create")
    public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO) {
        return ResponseEntity.ok(eventService.createEvent(eventDTO));
    }

    @GetMapping("/get/{secureId}")
    public ResponseEntity<EventDTO> getEvent(@PathVariable String secureId) {
        return ResponseEntity.ok(eventService.getEvent(secureId));
    }


}
