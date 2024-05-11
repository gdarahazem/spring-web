package tn.itbs.tp0.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Embeddable
public class EseignementId {
	
	
    @ManyToOne
    @JoinColumn(name = "idE")
    private Etudiant et;
    
    @ManyToOne
    @JoinColumn(name = "idP")
    private Prof pr;

}
