package com.mahmoudi.gestionbib;

import com.mahmoudi.gestionbib.Repo.LivreRepo;
import com.mahmoudi.gestionbib.entity.Livre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionBibApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionBibApplication.class, args);
	}


}
