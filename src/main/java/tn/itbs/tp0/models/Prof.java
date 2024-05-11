package tn.itbs.tp0.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data 
@Entity 

public class Prof {

@Id 
private int id ;
private String nom ;

@OneToMany (mappedBy = "eId.pr" )
private List<Enseignement> ListP = new ArrayList<Enseignement>();

	
}
