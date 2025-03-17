package com.flowalp.event.service;

import com.flowalp.event.dto.EventDTO;
import com.flowalp.event.entity.Event;
import com.flowalp.event.exception.DuplicateIdException;
import com.flowalp.event.mapper.EventMapper;
import com.flowalp.event.repository.EventRepository;
import com.flowalp.event.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {


    private final EventRepository eventRepository;
    private final EventMapper eventMapper;
    private final IdUtil idUtil;

    @Autowired
    private EventService(
            EventRepository eventRepository,
            EventMapper eventMapper,
            IdUtil idUtil
    ) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
        this.idUtil = idUtil;
    }

    public EventDTO createEvent(EventDTO eventDTO) {

        Event event = eventMapper.toEntity(eventDTO);
        event.setSecureId(idUtil.generateSecureId());

        Event savedEvent = eventRepository.save(event);
        return eventMapper.toDTO(savedEvent);
    }

    public EventDTO getEvent(String secureId) {
        Event event = eventRepository.findBySecureId(secureId);
        return eventMapper.toDTO(event);
    }

}
