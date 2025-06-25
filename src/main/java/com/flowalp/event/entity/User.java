package com.flowalp.event.entity;

import com.flowalp.event.entity.enums.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "user", schema = "event_flowalp")
public class User {

  @Id @GeneratedValue(strategy = GenerationType.UUID) @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)") private String id;

  @Column(name = "secure_id", columnDefinition = "CHAR(8)") private String secureId;

  @Column(name = "name", nullable = false) private String name;

  @Column(name = "last_name", nullable = false) private String lastName;

  @Column(name = "birth_date", nullable = false) private LocalDate birthDate;

  @Column(name = "role", nullable = false) private UserRole role;

  @Column(name = "parent_uuid", columnDefinition = "CHAR(36)") private String parentId;
}
