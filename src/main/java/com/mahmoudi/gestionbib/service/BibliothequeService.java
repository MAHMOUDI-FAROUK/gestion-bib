package com.mahmoudi.gestionbib.service;

import com.mahmoudi.gestionbib.Repo.AdherentRepo;
import com.mahmoudi.gestionbib.entity.Adherent;
import com.mahmoudi.gestionbib.entity.Livre;

import java.util.Collection;
import java.util.List;

public interface BibliothequeService {
    /*les services qui conserne classe Livre*/
    Livre createLivre(Livre livre);
    List<Livre> ListLivres(int limit);
    Livre getLivre(Long id);
    Livre updateLivre(Livre livre);
    Boolean deleteLivre(Long id);

    /*les services qui conserne classe adherent*/
    Adherent createAdherent(Adherent adherent);
    List<Adherent> listAdherents(int limit);
    Adherent getAdherent(Long id);
    Adherent updateAdherent(Adherent adherent);
    Boolean deleteAdherent(Long id);
    Adherent findAdherentByIsbnLivre(String isbn);



}
