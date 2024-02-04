package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepo extends JpaRepository<Livre, Long> {
}
