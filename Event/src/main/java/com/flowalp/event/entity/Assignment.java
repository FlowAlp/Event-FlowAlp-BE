package com.flowalp.event.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "assignment")
public class Assignment {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "activity_uuid", nullable = false)
    private com.flowalp.event.entity.Activity activityUuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "max_users")
    private Integer maxUsers;

    @ColumnDefault("0")
    @Column(name = "overnight")
    private Boolean overnight;

    @ColumnDefault("'NULL'")
    @Lob
    @Column(name = "assignment_period")
    private String assignmentPeriod;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

    @OneToMany(mappedBy = "assignmentUuid")
    private Set<com.flowalp.event.entity.AssignmentUserAssociation> assignmentUserAssociations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "assignmentUuid")
    private Set<com.flowalp.event.entity.TagAssignmentAssociation> tagAssignmentAssociations = new LinkedHashSet<>();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public com.flowalp.event.entity.Activity getActivityUuid() {
        return activityUuid;
    }

    public void setActivityUuid(com.flowalp.event.entity.Activity activityUuid) {
        this.activityUuid = activityUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Integer getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }

    public Boolean getOvernight() {
        return overnight;
    }

    public void setOvernight(Boolean overnight) {
        this.overnight = overnight;
    }

    public String getAssignmentPeriod() {
        return assignmentPeriod;
    }

    public void setAssignmentPeriod(String assignmentPeriod) {
        this.assignmentPeriod = assignmentPeriod;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<com.flowalp.event.entity.AssignmentUserAssociation> getAssignmentUserAssociations() {
        return assignmentUserAssociations;
    }

    public void setAssignmentUserAssociations(Set<com.flowalp.event.entity.AssignmentUserAssociation> assignmentUserAssociations) {
        this.assignmentUserAssociations = assignmentUserAssociations;
    }

    public Set<com.flowalp.event.entity.TagAssignmentAssociation> getTagAssignmentAssociations() {
        return tagAssignmentAssociations;
    }

    public void setTagAssignmentAssociations(Set<com.flowalp.event.entity.TagAssignmentAssociation> tagAssignmentAssociations) {
        this.tagAssignmentAssociations = tagAssignmentAssociations;
    }

}