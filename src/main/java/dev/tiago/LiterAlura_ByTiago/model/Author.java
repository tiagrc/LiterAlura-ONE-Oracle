package dev.tiago.LiterAlura_ByTiago.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private NationalityAuthor nationality;

    @OneToMany(mappedBy = "author")
    private List<Books> books = new ArrayList<>();

    public Author(){}

    public Author(String name, NationalityAuthor nationalityAuthor){
        this.name = name;
        this.nationality = nationalityAuthor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NationalityAuthor getNationality() {
        return nationality;
    }

    public void setNationality(NationalityAuthor nationality) {
        this.nationality = nationality;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return
                "Autor ='" + name + '\'' +
                "Nacionalidade=" + nationality +
                "Livros=" + books;
    }
}
