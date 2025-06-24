package com.flowalp.event.dto;

import com.flowalp.event.entity.enums.UserRole;
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
public class UserDTO {

  private String id;
  private String secureId;
  private String name;
  private String lastName;
  private LocalDate birthDate;
  private UserRole role;
  private String parentId;
  private List<TagDTO> tags;
}
