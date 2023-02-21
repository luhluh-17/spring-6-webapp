package dev.luhluh.spring6webapp.repositories;

import dev.luhluh.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
