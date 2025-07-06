package com.flowalp.event.service;

import com.flowalp.event.dto.ActivityDTO;
import com.flowalp.event.entity.Activity;
import com.flowalp.event.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ActivityService {

  private final ActivityRepository activityRepository;
  private final ModelMapper modelMapper;

  public ActivityDTO create(ActivityDTO dto) {
    var entity = activityRepository.save(modelMapper.map(dto, Activity.class));
    return modelMapper.map(entity, ActivityDTO.class);
  }
}
