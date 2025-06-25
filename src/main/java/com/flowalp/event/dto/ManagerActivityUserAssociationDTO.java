package com.flowalp.event.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ManagerActivityUserAssociationDTO {

  private String id;
  private ActivityDTO activity;
  private UserDTO user;
}
