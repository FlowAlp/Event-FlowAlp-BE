package com.flowalp.event.dto;

public class EventDTO {
    private String secureId; // Identificatore sicuro da esporre nelle API
    private String name;
    private String description;
    private String imageUrl;
    private String colorPrimary;
    private String colorSecondary;
    private String colorAccent;

    public EventDTO() {
    }

    public EventDTO(String secureId, String name, String description, String imageUrl,
                    String colorPrimary, String colorSecondary, String colorAccent) {
        this.secureId = secureId;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.colorPrimary = colorPrimary;
        this.colorSecondary = colorSecondary;
        this.colorAccent = colorAccent;
    }

    // Getter e Setter
    public String getSecureId() {
        return secureId;
    }

    public void setSecureId(String secureId) {
        this.secureId = secureId;
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
}
