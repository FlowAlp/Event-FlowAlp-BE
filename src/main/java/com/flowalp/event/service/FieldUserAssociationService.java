package com.flowalp.event.service;

import com.flowalp.event.dto.FieldUserAssociationDTO;
import com.flowalp.event.entity.FieldUserAssociation;
import com.flowalp.event.repository.FieldUserAssociationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class FieldUserAssociationService {

  private final FieldUserAssociationRepository fieldUserAssociationRepository;
  private final ModelMapper modelMapper;

  public FieldUserAssociationDTO create(FieldUserAssociationDTO dto) {
    var entity = fieldUserAssociationRepository.save(modelMapper.map(dto, FieldUserAssociation.class));
    return modelMapper.map(entity, FieldUserAssociationDTO.class);
  }
}
