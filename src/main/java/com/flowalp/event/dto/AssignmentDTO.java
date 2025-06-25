package com.flowalp.event.dto;

import java.time.Instant;
import java.time.LocalTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentDTO {

  private String id;
  private String secureId;
  private ActivityDTO activity;
  private String name;
  private String description;
  private LocalTime startTime;
  private LocalTime endTime;
  private Integer maxUsers;
  private Boolean overnight;
  private String assignmentPeriod;
  private List<TagDTO> tags;
  private Instant createdAt;
  private Instant updatedAt;
}
