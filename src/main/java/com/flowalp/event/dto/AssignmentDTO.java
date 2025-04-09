package com.flowalp.event.dto;

import java.time.LocalTime;
import java.util.List;

public class AssignmentDTO {
    private String secureId;
    private String activitySecureId;
    private String name;
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer maxUsers;
    private Boolean overnight;
    private String assignmentPeriod;
    private List<TagDTO> tags;

    public AssignmentDTO() {
    }

    public AssignmentDTO(String secureId, String activitySecureId, String name, String description,
                         LocalTime startTime, LocalTime endTime, Integer maxUsers,
                         Boolean overnight, String assignmentPeriod, List<TagDTO> tags) {
        this.secureId = secureId;
        this.activitySecureId = activitySecureId;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.maxUsers = maxUsers;
        this.overnight = overnight;
        this.assignmentPeriod = assignmentPeriod;
        this.tags = tags;
    }

    public String getSecureId() {
        return secureId;
    }

    public void setSecureId(String secureId) {
        this.secureId = secureId;
    }

    public String getActivitySecureId() {
        return activitySecureId;
    }

    public void setActivitySecureId(String activitySecureId) {
        this.activitySecureId = activitySecureId;
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

    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }
}
