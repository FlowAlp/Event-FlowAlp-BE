package com.flowalp.event.dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityDTO {

  private String id;
  private EventDTO event;
  private String name;
  private String description;
  private String imageUrl;
  private LocalDate date;
  private LocalDate endDate;
  private Boolean adultsOnly;
  private List<TagDTO> tags;
  private Instant createdAt;
  private Instant updatedAt;
}
