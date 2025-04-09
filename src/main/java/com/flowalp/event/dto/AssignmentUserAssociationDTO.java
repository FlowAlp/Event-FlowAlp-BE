package com.flowalp.event.dto;

public class AssignmentUserAssociationDTO {
    private String secureId;
    private String assignmentSecureId;
    private String userSecureId;
    private String comment;
    private String status;

    public AssignmentUserAssociationDTO() {
    }

    public AssignmentUserAssociationDTO(String secureId, String assignmentSecureId, String userSecureId,
                                        String comment, String status) {
        this.secureId = secureId;
        this.assignmentSecureId = assignmentSecureId;
        this.userSecureId = userSecureId;
        this.comment = comment;
        this.status = status;
    }

    public String getSecureId() {
        return secureId;
    }

    public void setSecureId(String secureId) {
        this.secureId = secureId;
    }

    public String getAssignmentSecureId() {
        return assignmentSecureId;
    }

    public void setAssignmentSecureId(String assignmentSecureId) {
        this.assignmentSecureId = assignmentSecureId;
    }

    public String getUserSecureId() {
        return userSecureId;
    }

    public void setUserSecureId(String userSecureId) {
        this.userSecureId = userSecureId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
