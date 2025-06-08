package dev.tiago.LiterAlura_ByTiago;

import dev.tiago.LiterAlura_ByTiago.main.Main;
import dev.tiago.LiterAlura_ByTiago.reopsitory.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraByTiagoApplication implements CommandLineRunner {

	@Autowired
	private AuthorRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraByTiagoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(repository);
		main.showMenu();
	}
}
