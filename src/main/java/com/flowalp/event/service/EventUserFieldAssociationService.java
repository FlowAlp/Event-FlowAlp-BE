package com.flowalp.event.service;

import com.flowalp.event.dto.EventUserFieldAssociationDTO;
import com.flowalp.event.entity.EventUserFieldAssociation;
import com.flowalp.event.repository.EventUserFieldAssociationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class EventUserFieldAssociationService {

  private final EventUserFieldAssociationRepository eventUserFieldAssociationRepository;
  private final ModelMapper modelMapper;

  public EventUserFieldAssociationDTO create(EventUserFieldAssociationDTO dto) {
    var entity = eventUserFieldAssociationRepository.save(modelMapper.map(dto, EventUserFieldAssociation.class));
    return modelMapper.map(entity, EventUserFieldAssociationDTO.class);
  }
}
