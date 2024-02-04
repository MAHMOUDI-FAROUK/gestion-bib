package com.mahmoudi.gestionbib.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatutLivre {
    @Id
    @GeneratedValue(strategy= AUTO)
    private Long id ;
    private String etat;
    @ManyToOne
    public Livre livre;

}
