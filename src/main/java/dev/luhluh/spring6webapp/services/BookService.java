package dev.luhluh.spring6webapp.services;

import dev.luhluh.spring6webapp.domain.Book;

public interface BookService {


    Iterable<Book> findAll();
}
