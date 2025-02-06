package com.flowalp.event.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image_url", length = 2083)
    private String imageUrl;

    @Column(name = "color_primary", nullable = false, length = 7)
    private String colorPrimary;

    @Column(name = "color_secondary", nullable = false, length = 7)
    private String colorSecondary;

    @Column(name = "color_accent", nullable = false, length = 7)
    private String colorAccent;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

    @OneToMany(mappedBy = "eventUuid")
    private Set<com.flowalp.event.entity.Activity> activities = new LinkedHashSet<>();

    @OneToMany(mappedBy = "eventUuid")
    private Set<com.flowalp.event.entity.Configuration> configurations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "eventUuid")
    private Set<com.flowalp.event.entity.EventUserFieldAssociation> eventUserFieldAssociations = new LinkedHashSet<>();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getColorPrimary() {
        return colorPrimary;
    }

    public void setColorPrimary(String colorPrimary) {
        this.colorPrimary = colorPrimary;
    }

    public String getColorSecondary() {
        return colorSecondary;
    }

    public void setColorSecondary(String colorSecondary) {
        this.colorSecondary = colorSecondary;
    }

    public String getColorAccent() {
        return colorAccent;
    }

    public void setColorAccent(String colorAccent) {
        this.colorAccent = colorAccent;
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

    public Set<com.flowalp.event.entity.Activity> getActivities() {
        return activities;
    }

    public void setActivities(Set<com.flowalp.event.entity.Activity> activities) {
        this.activities = activities;
    }

    public Set<com.flowalp.event.entity.Configuration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(Set<com.flowalp.event.entity.Configuration> configurations) {
        this.configurations = configurations;
    }

    public Set<com.flowalp.event.entity.EventUserFieldAssociation> getEventUserFieldAssociations() {
        return eventUserFieldAssociations;
    }

    public void setEventUserFieldAssociations(Set<com.flowalp.event.entity.EventUserFieldAssociation> eventUserFieldAssociations) {
        this.eventUserFieldAssociations = eventUserFieldAssociations;
    }

}