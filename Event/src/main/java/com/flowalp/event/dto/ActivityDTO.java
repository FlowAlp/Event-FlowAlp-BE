package com.flowalp.event.dto;

import java.time.LocalDate;
import java.util.List;

public class ActivityDTO {
    private String secureId;
    private String eventSecureId;
    private String name;
    private String description;
    private String imageUrl;
    private LocalDate date;
    private LocalDate endDate;
    private Boolean adultsOnly;
    private List<TagDTO> tags;

    public ActivityDTO() {
    }

    public ActivityDTO(String secureId, String eventSecureId, String name, String description,
                       String imageUrl, LocalDate date, LocalDate endDate, Boolean adultsOnly, List<TagDTO> tags) {
        this.secureId = secureId;
        this.eventSecureId = eventSecureId;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.date = date;
        this.endDate = endDate;
        this.adultsOnly = adultsOnly;
        this.tags = tags;
    }

    public String getSecureId() {
        return secureId;
    }

    public void setSecureId(String secureId) {
        this.secureId = secureId;
    }

    public String getEventSecureId() {
        return eventSecureId;
    }

    public void setEventSecureId(String eventSecureId) {
        this.eventSecureId = eventSecureId;
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

    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }
}
