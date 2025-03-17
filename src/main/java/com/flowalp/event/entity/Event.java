package com.flowalp.event.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Entity
@Table(name = "event", schema = "event_flowalp")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)")
    private String uuid;


    @Column(name = "secure_id", columnDefinition = "CHAR(8)")
    private String secureId;

    @Column(name = "name", nullable = false)
    private String name;

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

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setSecureId(String secureId) {
        this.secureId = secureId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setColorPrimary(String colorPrimary) {
        this.colorPrimary = colorPrimary;
    }

    public void setColorSecondary(String colorSecondary) {
        this.colorSecondary = colorSecondary;
    }

    public void setColorAccent(String colorAccent) {
        this.colorAccent = colorAccent;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

}