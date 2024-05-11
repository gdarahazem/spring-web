package tn.itbs.tp0.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.itbs.tp0.models.Etudiant;
import tn.itbs.tp0.repository.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public void addEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    public void updateEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }

}
