package com.flowalp.event.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EventDTO {
    private String secureId;
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

}
