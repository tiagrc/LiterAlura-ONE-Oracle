package dev.tiago.LiterAlura_ByTiago.Main;


import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public void showMenu() {
        int option = -1;

        while (option != 0){
            String menu = """
                    *** Escolhe um número para sua opção ***
                    
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

    private void buscarLivroPeloTitulo() {}

    private void listarLivrosRegistrados(){}

    private void listarAutoresRegistrados() {}

    private void listarAutoresVivosPorAno(){}

    private void listarLivrosPorIdioma() {}


}
