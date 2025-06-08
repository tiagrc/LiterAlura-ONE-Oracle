package dev.tiago.LiterAlura_ByTiago.reopsitory;

import dev.tiago.LiterAlura_ByTiago.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
