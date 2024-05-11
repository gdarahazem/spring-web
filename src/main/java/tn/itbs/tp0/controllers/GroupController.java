package tn.itbs.tp0.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tn.itbs.tp0.models.Groupe;
import tn.itbs.tp0.services.GroupeService;

import java.util.List;
@Controller
public class GroupController {

    @Autowired
    private GroupeService groupeService;

    @GetMapping("/groups")
    public String getAllGroups(Model model) {
        List<Groupe> groupes = groupeService.getAllGroupes();
        model.addAttribute("groupes", groupes);
        return "groupes";
    }

    @PostMapping("/add-group")
    public String addGroup(@RequestBody Groupe groupe) {
        groupeService.addGroupe(groupe);
        return "redirect:/groups";
    }

    @PostMapping("/update-group")
    public String updateGroup(@RequestBody Groupe groupe) {
        groupeService.updateGroupe(groupe);
        return "redirect:/groups";
    }

    @PostMapping("/delete-group")
    public String deleteGroup(@RequestParam("id") int id) {
        groupeService.deleteGroupe(id);
        return "redirect:/groups";
    }


}