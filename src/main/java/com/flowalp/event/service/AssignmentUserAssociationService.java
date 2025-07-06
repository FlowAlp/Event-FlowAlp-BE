package com.flowalp.event.service;

import com.flowalp.event.dto.AssignmentUserAssociationDTO;
import com.flowalp.event.entity.AssignmentUserAssociation;
import com.flowalp.event.repository.AssignmentUserAssociationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AssignmentUserAssociationService {

  private final AssignmentUserAssociationRepository assignmentUserAssociationRepository;
  private final ModelMapper modelMapper;

  public AssignmentUserAssociationDTO create(AssignmentUserAssociationDTO dto) {
    var entity = assignmentUserAssociationRepository.save(modelMapper.map(dto, AssignmentUserAssociation.class));
    return modelMapper.map(entity, AssignmentUserAssociationDTO.class);
  }
}
