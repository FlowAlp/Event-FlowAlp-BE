package com.flowalp.event.dto;

import com.flowalp.event.entity.enums.Status;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentUserAssociationDTO {

  private String id;
  private String secureId;
  private AssignmentDTO assignment;
  private UserDTO user;
  private String comment;
  private Status status;
  private Instant createdAt;
  private Instant updatedAt;
}
