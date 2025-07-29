package com.flowalp.event.entity;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
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

  @Id
  @Column(name = "uuid", length = 8, nullable = false, updatable = false)
  private String id = NanoIdUtils.randomNanoId(
      NanoIdUtils.DEFAULT_NUMBER_GENERATOR,
      NanoIdUtils.DEFAULT_ALPHABET, 8);

  @Column(name = "keycloak_id", nullable = false, unique = true) private String keycloakId;

  @Column(name = "name", nullable = false) private String name;

  @Column(name = "last_name", nullable = false) private String lastName;

  @Column(name = "birth_date", nullable = false) private LocalDate birthDate;

  @Column(name = "parent_uuid", length = 8) private String parentId;
}
