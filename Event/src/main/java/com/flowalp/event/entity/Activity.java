package com.flowalp.event.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "event_uuid", nullable = false)
    private com.flowalp.event.entity.Event eventUuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image_url", length = 2083)
    private String imageUrl;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "end_date")
    private LocalDate endDate;

    @ColumnDefault("0")
    @Column(name = "adults_only")
    private Boolean adultsOnly;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

    @OneToMany(mappedBy = "activityUuid")
    private Set<com.flowalp.event.entity.Assignment> assignments = new LinkedHashSet<>();

    @OneToMany(mappedBy = "activityUuid")
    private Set<com.flowalp.event.entity.ManagerActivityUserAssociation> managerActivityUserAssociations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "activityUuid")
    private Set<com.flowalp.event.entity.TagActivityAssociation> tagActivityAssociations = new LinkedHashSet<>();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public com.flowalp.event.entity.Event getEventUuid() {
        return eventUuid;
    }

    public void setEventUuid(com.flowalp.event.entity.Event eventUuid) {
        this.eventUuid = eventUuid;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Boolean getAdultsOnly() {
        return adultsOnly;
    }

    public void setAdultsOnly(Boolean adultsOnly) {
        this.adultsOnly = adultsOnly;
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

    public Set<com.flowalp.event.entity.Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(Set<com.flowalp.event.entity.Assignment> assignments) {
        this.assignments = assignments;
    }

    public Set<com.flowalp.event.entity.ManagerActivityUserAssociation> getManagerActivityUserAssociations() {
        return managerActivityUserAssociations;
    }

    public void setManagerActivityUserAssociations(Set<com.flowalp.event.entity.ManagerActivityUserAssociation> managerActivityUserAssociations) {
        this.managerActivityUserAssociations = managerActivityUserAssociations;
    }

    public Set<com.flowalp.event.entity.TagActivityAssociation> getTagActivityAssociations() {
        return tagActivityAssociations;
    }

    public void setTagActivityAssociations(Set<com.flowalp.event.entity.TagActivityAssociation> tagActivityAssociations) {
        this.tagActivityAssociations = tagActivityAssociations;
    }

}