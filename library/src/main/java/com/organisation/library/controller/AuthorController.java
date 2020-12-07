package com.organisation.library.controller;

import com.organisation.library.dtos.AuthorRequestDto;
import com.organisation.library.entities.Author;
import com.organisation.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    public Author addAuthor(@RequestBody AuthorRequestDto authorRequestDto) {
        return authorService.saveAuthor(authorRequestDto);
    }
}
