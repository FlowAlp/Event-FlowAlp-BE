package com.flowalp.event.service;

import com.flowalp.event.dto.TagUserAssociationDTO;
import com.flowalp.event.entity.TagUserAssociation;
import com.flowalp.event.repository.TagUserAssociationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TagUserAssociationService {

  private final TagUserAssociationRepository tagUserAssociationRepository;
  private final ModelMapper modelMapper;

  public TagUserAssociationDTO create(TagUserAssociationDTO dto) {
    var entity = tagUserAssociationRepository.save(modelMapper.map(dto, TagUserAssociation.class));
    return modelMapper.map(entity, TagUserAssociationDTO.class);
  }
}
