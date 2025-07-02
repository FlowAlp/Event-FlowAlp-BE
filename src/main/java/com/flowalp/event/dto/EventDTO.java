package com.flowalp.event.dto;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {

  private String id;
  private String name;
  private String description;
  private String imageUrl;
  private String colorPrimary;
  private String colorSecondary;
  private String colorAccent;
  private Instant createdAt;
  private Instant updatedAt;
}
