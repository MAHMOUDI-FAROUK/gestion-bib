package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Sanction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanctionRepo extends JpaRepository<Sanction, Long> {
}
