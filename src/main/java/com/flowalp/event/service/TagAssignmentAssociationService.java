package com.flowalp.event.service;

import com.flowalp.event.dto.TagAssignmentAssociationDTO;
import com.flowalp.event.entity.TagAssignmentAssociation;
import com.flowalp.event.repository.TagAssignmentAssociationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TagAssignmentAssociationService {

  private final TagAssignmentAssociationRepository tagAssignmentAssociationRepository;
  private final ModelMapper modelMapper;

  public TagAssignmentAssociationDTO create(TagAssignmentAssociationDTO dto) {
    var entity = tagAssignmentAssociationRepository.save(modelMapper.map(dto, TagAssignmentAssociation.class));
    return modelMapper.map(entity, TagAssignmentAssociationDTO.class);
  }
}
