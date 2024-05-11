package tn.itbs.tp0.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.itbs.tp0.models.Etudiant ;


@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant , Integer> {
List<Etudiant>findByNom(String nom ) ; 
List<Etudiant>findByNoteLessThan (int note);
List<Etudiant>findByNomContainingAndNoteGreaterThan(String nom , int note);
}
