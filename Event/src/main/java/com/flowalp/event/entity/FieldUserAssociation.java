package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "field_user_association", schema = "event_flowalp")
public class FieldUserAssociation {
    @Id
    @Column(name = "uuid", nullable = false, columnDefinition = "CHAR(36)")
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_uuid", nullable = false)
    private User userUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field_uuid", nullable = false)
    private UserField fieldUuid;

    @Lob
    @Column(name = "value", nullable = false)
    private String value;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public User getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(User userUuid) {
        this.userUuid = userUuid;
    }

    public UserField getFieldUuid() {
        return fieldUuid;
    }

    public void setFieldUuid(UserField fieldUuid) {
        this.fieldUuid = fieldUuid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}