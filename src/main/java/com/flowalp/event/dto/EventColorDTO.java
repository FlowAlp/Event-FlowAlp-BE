package com.flowalp.event.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventColorDTO {

  private String uuid;
  private EventDTO event;
  private String variableName;
  private String colorHex;
}
