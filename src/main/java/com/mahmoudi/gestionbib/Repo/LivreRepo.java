package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepo extends JpaRepository<Livre, Long> {
    //Livre findByName(String name);
    Livre findByIsbn(String isbn);
    List<Livre> findByStatutLivre (String statusLivre);

}
