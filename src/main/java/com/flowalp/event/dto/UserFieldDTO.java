package com.flowalp.event.dto;

public class UserFieldDTO {
    private String name;
    private String fieldType;


    public UserFieldDTO() {
    }

    public UserFieldDTO(String name, String fieldType) {
        this.name = name;
        this.fieldType = fieldType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }
}
