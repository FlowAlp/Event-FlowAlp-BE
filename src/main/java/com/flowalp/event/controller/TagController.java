package com.flowalp.event.controller;

import com.flowalp.event.dto.TagDTO;
import com.flowalp.event.service.TagService;
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
public class TagController {

  private final TagService tagService;
  private static final String TAG_PATH = "tag";

  @PostMapping(TAG_PATH + "/create")
  public ResponseEntity<TagDTO> create(@RequestBody TagDTO tagDTO) {
    return new ResponseEntity<>(tagService.create(tagDTO), HttpStatus.OK);
  }
}
