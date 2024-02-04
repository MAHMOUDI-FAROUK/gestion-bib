package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Emprunter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprunterRepo extends JpaRepository<Emprunter, Long> {
}
