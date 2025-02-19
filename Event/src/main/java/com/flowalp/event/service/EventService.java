package com.flowalp.event.service;

import com.flowalp.event.dto.EventDTO;
import com.flowalp.event.entity.Event;
import com.flowalp.event.mapper.EventMapper;
import com.flowalp.event.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {


    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    @Autowired
    private EventService(
            EventRepository eventRepository,
            EventMapper eventMapper
    ) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }

    public EventDTO createEvent(EventDTO eventDTO) {
        Event event = eventMapper.toEntity(eventDTO);
        Event savedEvent = eventRepository.save(event);
        return eventMapper.toDTO(savedEvent);
    }

    public EventDTO getEvent(String secureId) {
        Event event = eventRepository.findBySecureId(secureId);
        return eventMapper.toDTO(event);
    }

}
