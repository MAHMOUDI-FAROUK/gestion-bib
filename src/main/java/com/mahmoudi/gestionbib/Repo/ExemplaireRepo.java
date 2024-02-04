package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Exemplaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExemplaireRepo extends JpaRepository<Exemplaire, Long> {
}
