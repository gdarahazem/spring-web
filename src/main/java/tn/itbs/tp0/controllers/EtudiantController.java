package tn.itbs.tp0.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tn.itbs.tp0.models.Etudiant;
import tn.itbs.tp0.models.Groupe;
import tn.itbs.tp0.repository.EtudiantRepository;
import tn.itbs.tp0.services.EtudiantService;
import tn.itbs.tp0.services.GroupeService;

import java.util.List;

@Controller
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;
    @Autowired
    private GroupeService groupeService;

    @GetMapping("/etudiants")
    public String getAllEtudiants(Model model) {
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
        model.addAttribute("etudiants", etudiants);

        List<Groupe> groupes = groupeService.getAllGroupes();
        model.addAttribute("groupes", groupes);
        return "etudiants";
    }

    @PostMapping("/add-etudiant")
    public String addEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.addEtudiant(etudiant);
        return "redirect:/etudiants";
    }

    @PostMapping("/update-etudiant")
    public String updateEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.updateEtudiant(etudiant);
        return "redirect:/etudiants";
    }

    @PostMapping("/delete-etudiant")
    public String deleteEtudiant(@RequestParam("id") int id) {
        etudiantService.deleteEtudiant(id);
        return "redirect:/etudiants";
    }
}
