package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Adherent;
import com.mahmoudi.gestionbib.entity.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepo extends JpaRepository<Auteur, Long> {
    AuteurRepo findByName(String Name);


}
