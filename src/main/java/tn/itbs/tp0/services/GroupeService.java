package tn.itbs.tp0.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.itbs.tp0.models.Groupe;
import tn.itbs.tp0.repository.GroupeRepository;

import java.util.List;

@Service
public class GroupeService {

    @Autowired
    private GroupeRepository groupeRepository;

    public List<Groupe> getAllGroupes() {
        return groupeRepository.findAll();
    }

    public void addGroupe(Groupe groupe) {
        groupeRepository.save(groupe);
    }

    public void updateGroupe(Groupe groupe) {
        groupeRepository.save(groupe);
    }

    public void deleteGroupe(int id) {
        groupeRepository.deleteById(id);
    }
}