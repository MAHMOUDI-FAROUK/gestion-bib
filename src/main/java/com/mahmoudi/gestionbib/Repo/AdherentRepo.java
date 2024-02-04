package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdherentRepo extends JpaRepository<Adherent, Long > {
    Adherent findByName(String Name);
    //Adherent findByIsbnLivre(String isbn);
    //List<Adherent> findByStatutLivre(String statutLivre);
}
