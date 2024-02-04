package com.mahmoudi.gestionbib.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adherent extends Personne{
//    @EmbeddedId
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id ;
    private String typeAdhesion;
    private Date dateAdhesion;
    @OneToMany
    @Size(max = 3, message = "Le nombre des livres empruntées par personne ne dépasse pas 3")
    @Valid
    List<Livre> livres;
    @OneToMany
    List<Sanction> sanctions;
    @OneToMany(mappedBy = "adherent")
    private List<Emprunter> emprunts;
    @OneToMany(mappedBy = "adherent")
    private List<Reserver> reservers;
}
