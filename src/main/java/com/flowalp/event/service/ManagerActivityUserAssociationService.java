package com.flowalp.event.service;

import com.flowalp.event.dto.ManagerActivityUserAssociationDTO;
import com.flowalp.event.entity.ManagerActivityUserAssociation;
import com.flowalp.event.repository.ManagerActivityUserAssociationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ManagerActivityUserAssociationService {

  private final ManagerActivityUserAssociationRepository managerActivityUserAssociationRepository;
  private final ModelMapper modelMapper;

  public ManagerActivityUserAssociationDTO create(ManagerActivityUserAssociationDTO dto) {
    var entity = managerActivityUserAssociationRepository.save(modelMapper.map(dto, ManagerActivityUserAssociation.class));
    return modelMapper.map(entity, ManagerActivityUserAssociationDTO.class);
  }
}
