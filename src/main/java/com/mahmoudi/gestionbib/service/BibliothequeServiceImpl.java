package com.mahmoudi.gestionbib.service;

import com.mahmoudi.gestionbib.Repo.AdherentRepo;
import com.mahmoudi.gestionbib.Repo.LivreRepo;
import com.mahmoudi.gestionbib.entity.Adherent;
import com.mahmoudi.gestionbib.entity.Livre;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

import static java.lang.Boolean.TRUE;

@Service
@Transactional
@Slf4j
public class BibliothequeServiceImpl implements BibliothequeService{
    @Autowired
    private AdherentRepo adherentRepo;

    @Autowired
    private LivreRepo livreRepo;



    @Override
    public Livre createLivre(Livre livre) {
        log.info("enregistrer nouveau Livre : {}", livre.getTitre());
        return livreRepo.save(livre);
    }

    @Override
    public List<Livre> ListLivres(int limit) {
        log.info("Récupérer tous les Livres: {}");
        return livreRepo.findAll(PageRequest.of(0 , limit)).toList();
    }

    @Override
    public Livre getLivre(Long id) {
        log.info("Récupérer Livre avec id: {}", id);
        return livreRepo.findById(id).get();
    }

    @Override
    public Livre updateLivre(Livre livre) {
        log.info("Mise à jour du Livre : {}", livre.getTitre());
        return livreRepo.save(livre);
    }

    @Override
    public Boolean deleteLivre(Long id) {
        log.info("supprimer livre avec id : {}", id);
        livreRepo.deleteById(id);
        return TRUE;
    }

    @Override
    public Adherent createAdherent(Adherent adherent) {
        log.info("enregistrer nouveau Adherent : {}", adherent.getNom());
        return adherentRepo.save(adherent);
    }

    @Override
    public List<Adherent> listAdherents(int limit) {
        log.info("Récupérer tous les adherent:");
        return adherentRepo.findAll(PageRequest.of(0 , limit)).toList();
    }

    @Override
    public Adherent getAdherent(Long id) {
        return null;
    }

    @Override
    public Adherent updateAdherent(Adherent adherent) {
        return null;
    }

    @Override
    public Boolean deleteAdherent(Long id) {
        return null;
    }

    @Override
    public Adherent findAdherentByIsbnLivre(String isbn) {
        return livreRepo.findByIsbn(isbn).getAdherent();
    }
}
