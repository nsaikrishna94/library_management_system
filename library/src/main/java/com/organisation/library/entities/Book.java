package com.organisation.library.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "book")
@NoArgsConstructor
public class Book extends BaseEntity {

    private String title;

    private String description;

    @ManyToOne
    private Author author;
}
