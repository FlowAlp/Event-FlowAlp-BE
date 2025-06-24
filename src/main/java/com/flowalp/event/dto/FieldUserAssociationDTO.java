package com.flowalp.event.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FieldUserAssociationDTO {

  private String id;
  private UserDTO user;
  private UserFieldsDTO userField;
  private String value;
}
