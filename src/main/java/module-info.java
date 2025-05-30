module Event {
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires org.mapstruct;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.web;
    requires spring.beans;
    requires static lombok;

    opens com.flowalp.event.entity;
    opens com.flowalp.event.mapper;
    opens com.flowalp.event.dto;
    opens com.flowalp.event.service;
    opens com.flowalp.event.controller;

    exports com.flowalp.event.entity;
    exports com.flowalp.event.mapper;
    exports com.flowalp.event.dto;
    exports com.flowalp.event.service;
    exports com.flowalp.event.controller;
    exports com.flowalp.event.repository;
    exports com.flowalp.event.exception;
    exports com.flowalp.event.util;

    exports com.flowalp.event;
}
