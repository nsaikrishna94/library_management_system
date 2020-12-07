package com.organisation.library.service;

import com.organisation.library.dtos.AuthorRequestDto;
import com.organisation.library.entities.Author;
import com.organisation.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author saveAuthor(AuthorRequestDto authorRequestDto) {
        return authorRepository.save(new Author(authorRequestDto));
    }
}

