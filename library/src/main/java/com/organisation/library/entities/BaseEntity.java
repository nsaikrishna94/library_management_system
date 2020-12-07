package com.organisation.library.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Integer version;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "last_updated_on")
    private Date lastUpdatedOn;

    @PrePersist
    public void beforeInsert() {
        if(createdOn == null) createdOn = new Date();
    }

    @PreUpdate
    public void beforeUpdate() {
        lastUpdatedOn = new Date();
    }
}