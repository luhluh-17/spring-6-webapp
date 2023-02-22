package dev.luhluh.spring6webapp.services;

import dev.luhluh.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
