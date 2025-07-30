package com.flowalp.event.controller;

import com.flowalp.event.dto.ThemeDTO;
import com.flowalp.event.service.ThemeService;
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
public class ThemeController {

  private final ThemeService themeService;
  private static final String THEME = "theme";

  @GetMapping(THEME + "/get-all-by-event/{eventId}")
  public ResponseEntity<List<ThemeDTO>> getColorByEvent(@PathVariable String eventId) {
    return new ResponseEntity<>(themeService.findAllByEvent(eventId), HttpStatus.OK);
  }
}
