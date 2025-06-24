package com.flowalp.event.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagUserAssociationDTO {

  private String id;
  private TagDTO tag;
  private UserDTO user;
}
