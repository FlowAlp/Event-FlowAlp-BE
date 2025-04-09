package com.flowalp.event.entity;

import com.flowalp.event.entity.enums.AssigmentPeriod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "assignments", schema = "event_flowalp") // Evita conflitti con parole riservate
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)")
    private String uuid = UUID.randomUUID().toString();

    @Column(name = "secure_id", columnDefinition = "CHAR(8)")
    private String secureId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "activity_uuid", nullable = false)
    private Activity activity;  // Nome corretto

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "max_users")
    private Integer maxUsers;

    @Column(name = "overnight", nullable = false)
    private Boolean overnight = false; // Evita problemi con @ColumnDefault

    @Column(name = "assignment_period")
    private AssigmentPeriod assignmentPeriod;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt = Instant.now();
}
