package com.flowalp.event.service;

import com.flowalp.event.dto.TagActivityAssociationDTO;
import com.flowalp.event.entity.TagActivityAssociation;
import com.flowalp.event.repository.TagActivityAssociationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TagActivityAssociationService {

  private final TagActivityAssociationRepository tagActivityAssociationRepository;
  private final ModelMapper modelMapper;

  public TagActivityAssociationDTO create(TagActivityAssociationDTO dto) {
    var entity = tagActivityAssociationRepository.save(modelMapper.map(dto, TagActivityAssociation.class));
    return modelMapper.map(entity, TagActivityAssociationDTO.class);
  }
}
