package com.flowalp.event.service;

import com.flowalp.event.dto.EventDTO;
import com.flowalp.event.entity.Event;
import com.flowalp.event.repository.EventRepository;
import com.flowalp.event.util.IdUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class EventService {

  private final EventRepository eventRepository;
  private final ModelMapper modelMapper;
  private final IdUtil idUtil;

  public EventDTO createEvent(EventDTO eventDTO) {
    eventDTO.setSecureId(idUtil.generateSecureId());
    var event = eventRepository.save(modelMapper.map(eventDTO, Event.class));
    return modelMapper.map(event, EventDTO.class);
  }

  public EventDTO getEvent(String secureId) {
    return modelMapper.map(eventRepository.findBySecureId(secureId), EventDTO.class);
  }
}
