package tn.itbs.tp0.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Data
@Entity


public class Etudiant {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique = true, length = 20)

    private String nom;
    private int note;

    @ManyToOne

    @JoinColumn(name = "idG")
    private Groupe gr;

    @OneToMany(mappedBy = "eId.et")
    private List<Enseignement> listE = new ArrayList<Enseignement>();
}



