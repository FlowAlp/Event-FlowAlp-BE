package com.flowalp.event.dto;

import java.time.LocalDate;
import java.util.List;

public class UserDTO {
    private String secureId;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String role;
    private String parentSecureId;
    private List<TagDTO> tags;

    public UserDTO() {
    }

    public UserDTO(String secureId, String name, String lastName, LocalDate birthDate,
                   String role, String parentSecureId, List<TagDTO> tags) {
        this.secureId = secureId;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.role = role;
        this.parentSecureId = parentSecureId;
        this.tags = tags;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getParentSecureId() {
        return parentSecureId;
    }

    public void setParentSecureId(String parentSecureId) {
        this.parentSecureId = parentSecureId;
    }

    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }
}
