package com.mahmoudi.gestionbib.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exemplaire extends Livre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;
    private int nbreExemplaire ;
    @OneToMany(mappedBy = "exemplaire")
    private List<Reserver> reservers;


}
