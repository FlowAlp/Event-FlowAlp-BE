package com.flowalp.event.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "field_user_association")
public class FieldUserAssociation {
    @Id
    @Column(name = "uuid", nullable = false, length = 36)
    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_uuid", nullable = false)
    private com.flowalp.event.entity.User userUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field_uuid", nullable = false)
    private com.flowalp.event.entity.UserField fieldUuid;

    @Lob
    @Column(name = "value", nullable = false)
    private String value;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public com.flowalp.event.entity.User getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(com.flowalp.event.entity.User userUuid) {
        this.userUuid = userUuid;
    }

    public com.flowalp.event.entity.UserField getFieldUuid() {
        return fieldUuid;
    }

    public void setFieldUuid(com.flowalp.event.entity.UserField fieldUuid) {
        this.fieldUuid = fieldUuid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}