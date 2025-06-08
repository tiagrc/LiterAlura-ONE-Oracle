package dev.tiago.LiterAlura_ByTiago.main;


import dev.tiago.LiterAlura_ByTiago.model.Author;
import dev.tiago.LiterAlura_ByTiago.model.NationalityAuthor;
import dev.tiago.LiterAlura_ByTiago.reopsitory.AuthorRepository;
import dev.tiago.LiterAlura_ByTiago.service.ConsumoApi;

import java.util.Scanner;

public class Main {
    private final AuthorRepository repository;
    private Scanner sc = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private final String URL_BASE= "gutendex.com/books?Search=";

    public Main(AuthorRepository repository) {
        this.repository = repository;
    }

    public void showMenu() {
        int option = -1;

        while (option != 0){
            String menu = """
                    *** Opções ***
                    
                    1 - buscar livro pelo título
                    2 - listar livros registrados
                    3 - listar autores registrados
                    4 - listar autores vivos em determinado ano
                    5 - listar livros em determinado idioma
                    
                    0 - sair!
                    """;
            System.out.println(menu);
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    buscarLivroPeloTitulo();
                    break;
                case 2:
                    listarLivrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosPorAno();
                    break;
                case 5:
                    listarLivrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Saindo da aplicação!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void buscarLivroPeloTitulo() {
            System.out.println("Qual livro você deseja buscar? ");
            var searchBook = sc.nextLine();
            searchBook.replace(" ", "+");
            System.out.println("Qual a nacionalidade do artista? (es - espanha, fr - frances, en - ingles, pt - portugues )");
            var nationatily = sc.nextLine();
            NationalityAuthor nationalityAuthor = NationalityAuthor.valueOf(nationatily.toUpperCase());
            Author author = new Author(searchBook, nationalityAuthor);
            repository.save(author);
        }

    private void listarLivrosRegistrados(){}

    private void listarAutoresRegistrados() {}

    private void listarAutoresVivosPorAno(){}

    private void listarLivrosPorIdioma() {}


}
