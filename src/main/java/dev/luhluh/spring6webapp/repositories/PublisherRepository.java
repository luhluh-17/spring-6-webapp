package dev.luhluh.spring6webapp.repositories;

import dev.luhluh.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
