package com.flowalp.event.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventUserFieldAssociationDTO {

  private String id;
  private EventDTO event;
  private UserFieldsDTO userField;
  private Boolean required;
}
