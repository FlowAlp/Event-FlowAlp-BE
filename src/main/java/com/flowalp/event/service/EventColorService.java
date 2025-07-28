package com.flowalp.event.service;

import com.flowalp.event.dto.EventColorDTO;
import com.flowalp.event.entity.EventColor;
import com.flowalp.event.repository.EventColorRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class EventColorService {

  private final EventColorRepository eventColorRepository;
  private final ModelMapper modelMapper;

  public EventColorDTO createEventColor(EventColorDTO eventColorDTO) {
    var eventColor = eventColorRepository.save(modelMapper.map(eventColorDTO, EventColor.class));
    return modelMapper.map(eventColor, EventColorDTO.class);
  }

  public List<EventColorDTO> findAllByEvent(String eventId) {
    var eventColors = eventColorRepository.findByEventId(eventId);
    return eventColors.stream().map(eventColor -> modelMapper.map(eventColor, EventColorDTO.class)).toList();
  }
}
