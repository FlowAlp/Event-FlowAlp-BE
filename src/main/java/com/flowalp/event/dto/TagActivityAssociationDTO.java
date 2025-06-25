package com.flowalp.event.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagActivityAssociationDTO {

  private String id;
  private TagDTO tag;
  private ActivityDTO activity;
}
