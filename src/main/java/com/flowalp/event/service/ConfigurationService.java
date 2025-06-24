package com.flowalp.event.service;

import com.flowalp.event.dto.ConfigurationDTO;
import com.flowalp.event.entity.Configuration;
import com.flowalp.event.repository.ConfigurationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ConfigurationService {

  private final ConfigurationRepository configurationRepository;
  private final ModelMapper modelMapper;

  public ConfigurationDTO create(ConfigurationDTO dto) {
    var entity = configurationRepository.save(modelMapper.map(dto, Configuration.class));
    return modelMapper.map(entity, ConfigurationDTO.class);
  }
}
