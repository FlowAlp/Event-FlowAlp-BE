package com.flowalp.event.service;

import com.flowalp.event.dto.UserFieldsDTO;
import com.flowalp.event.entity.UserFields;
import com.flowalp.event.repository.UserFieldsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserFieldsService {

  private final UserFieldsRepository userFieldsRepository;
  private final ModelMapper modelMapper;

  public UserFieldsDTO create(UserFieldsDTO dto) {
    var entity = userFieldsRepository.save(modelMapper.map(dto, UserFields.class));
    return modelMapper.map(entity, UserFieldsDTO.class);
  }
}
