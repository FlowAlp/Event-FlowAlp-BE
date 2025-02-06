package com.flowalp.event.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "assignment_user_association")
public class AssignmentUserAssociation {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "assignment_uuid", nullable = false)
    private com.flowalp.event.entity.Assignment assignmentUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_uuid", nullable = false)
    private com.flowalp.event.entity.User userUuid;

    @Lob
    @Column(name = "comment")
    private String comment;

    @Lob
    @Column(name = "status", nullable = false)
    private String status;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public com.flowalp.event.entity.Assignment getAssignmentUuid() {
        return assignmentUuid;
    }

    public void setAssignmentUuid(com.flowalp.event.entity.Assignment assignmentUuid) {
        this.assignmentUuid = assignmentUuid;
    }

    public com.flowalp.event.entity.User getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(com.flowalp.event.entity.User userUuid) {
        this.userUuid = userUuid;
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

}