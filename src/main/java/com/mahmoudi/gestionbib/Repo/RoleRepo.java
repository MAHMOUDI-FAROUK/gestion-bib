package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Reserver;
import com.mahmoudi.gestionbib.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
