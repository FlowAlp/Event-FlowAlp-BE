package com.flowalp.event.service;

import com.flowalp.event.dto.UserDTO;
import com.flowalp.event.entity.User;
import com.flowalp.event.repository.UserRepository;
import com.flowalp.event.util.IdUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

  private final UserRepository userRepository;
  private final ModelMapper modelMapper;
  private final IdUtil idUtil;

  public UserDTO create(UserDTO dto) {
    dto.setSecureId(idUtil.generateSecureId());
    var entity = userRepository.save(modelMapper.map(dto, User.class));
    return modelMapper.map(entity, UserDTO.class);
  }
}
