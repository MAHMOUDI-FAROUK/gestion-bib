package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Reserver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserverRepo extends JpaRepository<Reserver, Long> {
}
