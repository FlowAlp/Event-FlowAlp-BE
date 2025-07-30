package com.flowalp.event.service;

import com.flowalp.event.dto.ThemeDTO;
import com.flowalp.event.entity.Theme;
import com.flowalp.event.repository.ThemeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ThemeService {

  private final ThemeRepository eventColorRepository;
  private final ModelMapper modelMapper;

  public ThemeDTO createTheme(ThemeDTO themeDTO) {
    var eventColor = eventColorRepository.save(modelMapper.map(themeDTO, Theme.class));
    return modelMapper.map(eventColor, ThemeDTO.class);
  }

  public List<ThemeDTO> findAllByEvent(String eventId) {
    var themes = eventColorRepository.findByEventId(eventId);
    return themes.stream().map(theme -> modelMapper.map(theme, ThemeDTO.class)).toList();
  }
}
