package com.mahmoudi.gestionbib.Repo;

import com.mahmoudi.gestionbib.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
