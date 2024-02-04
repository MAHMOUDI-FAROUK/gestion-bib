package com.mahmoudi.gestionbib.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;
    private String titre;
    @Column(unique = true)
    @NotEmpty(message = "ISBN ne peut pas être vide")
    private String isbn;
    private Date dateEdition;
    @OneToOne
    public Adherent adherent;
    @OneToOne
    public StatutLivre statutLivre;
    @OneToOne
    public Category category;
    @OneToMany(mappedBy = "livre")
    private List<Emprunter> emprunts;
}
