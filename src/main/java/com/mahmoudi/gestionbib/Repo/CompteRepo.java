package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepo extends JpaRepository<Compte, Long> {
}
