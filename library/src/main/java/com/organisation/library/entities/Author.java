package com.organisation.library.entities;

import com.organisation.library.dtos.AuthorRequestDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "author")
@NoArgsConstructor
public class Author extends BaseEntity {

    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "author")
    private List<Book> books;

    public Author(AuthorRequestDto authorRequestDto) {
        this.name = authorRequestDto.name;
    }
}
