package com.mahmoudi.gestionbib.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Long id ;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String libelle;
    @OneToMany
    List<Livre> livresCategory;
}
