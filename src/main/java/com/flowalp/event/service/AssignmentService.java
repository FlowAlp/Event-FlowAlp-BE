package com.flowalp.event.service;

import com.flowalp.event.dto.AssignmentDTO;
import com.flowalp.event.entity.Assignment;
import com.flowalp.event.repository.AssignmentRepository;
import com.flowalp.event.util.IdUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AssignmentService {

  private final AssignmentRepository assignmentRepository;
  private final ModelMapper modelMapper;
  private final IdUtil idUtil;

  public AssignmentDTO create(AssignmentDTO dto) {
    dto.setSecureId(idUtil.generateSecureId());
    var entity = assignmentRepository.save(modelMapper.map(dto, Assignment.class));
    return modelMapper.map(entity, AssignmentDTO.class);
  }
}
