package com.flowalp.event.service;

import com.flowalp.event.dto.TagDTO;
import com.flowalp.event.entity.Tag;
import com.flowalp.event.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TagService {

  private final TagRepository tagRepository;
  private final ModelMapper modelMapper;

  public TagDTO create(TagDTO dto) {
    var entity = tagRepository.save(modelMapper.map(dto, Tag.class));
    return modelMapper.map(entity, TagDTO.class);
  }
}
