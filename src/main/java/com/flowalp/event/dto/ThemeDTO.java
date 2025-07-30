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
public class ThemeDTO {

  private String id;
  private String eventId;
  private String name;
  private String primaryColor;
  private String backgroundColor;
  private String textColor;
  private String onPrimaryColor;
  private String linkColor;
  private String borderColor;
  private String surfaceGround;
  private String surfaceCard;
  private String textColorSecondary;
  private Boolean light;
  private Instant createdAt;
  private Instant updatedAt;

}
