package com.flowalp.event.mapper;

import com.flowalp.event.dto.EventDTO;
import com.flowalp.event.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EventMapper {

    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);

    @Mapping(target = "uuid", ignore = true)
    @Mapping(source = "secureId", target = "secureId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "imageUrl", target = "imageUrl")
    @Mapping(source = "colorPrimary", target = "colorPrimary")
    @Mapping(source = "colorSecondary", target = "colorSecondary")
    @Mapping(source = "colorAccent", target = "colorAccent")
    Event toEntity(EventDTO dto);

    @Mapping(source = "secureId", target = "secureId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "imageUrl", target = "imageUrl")
    @Mapping(source = "colorPrimary", target = "colorPrimary")
    @Mapping(source = "colorSecondary", target = "colorSecondary")
    @Mapping(source = "colorAccent", target = "colorAccent")
    EventDTO toDTO(Event entity);
}
