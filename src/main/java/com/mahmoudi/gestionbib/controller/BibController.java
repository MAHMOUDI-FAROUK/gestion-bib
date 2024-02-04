package com.mahmoudi.gestionbib.controller;

import com.mahmoudi.gestionbib.entity.Livre;
import com.mahmoudi.gestionbib.service.BibliothequeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bib")
@RequiredArgsConstructor
public class BibController {
    @Autowired
    private  BibliothequeServiceImpl bibliothequeServiceImplp;

    @GetMapping("/livre/list")
    public ResponseEntity<List<Livre>> getAllBooksDetails () {
        List<Livre> livres = bibliothequeServiceImplp.ListLivres(10);
        return new ResponseEntity<>(livres, HttpStatus.OK);
    }
    @GetMapping("/livre/{id}")
    public ResponseEntity<Livre> getBookDetails(@PathVariable("id") Long id){
        Livre livre = bibliothequeServiceImplp.getLivre(id);
        return new ResponseEntity<Livre>(livre, HttpStatus.OK);
    }
    @PostMapping("/livre/add")
    public ResponseEntity<Livre> createBook(@RequestBody Livre livre) {
        Livre newlivre = bibliothequeServiceImplp.createLivre(livre);
        return new ResponseEntity<Livre>(newlivre, HttpStatus.CREATED);
    }

    @PutMapping("/livre/update")
    public ResponseEntity<Livre> updateBook(@RequestBody Livre livre) {
        Livre newlivre = bibliothequeServiceImplp.updateLivre(livre);
        return new ResponseEntity<Livre>(newlivre, HttpStatus.CREATED);
    }

}
