package tn.itbs.tp0.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EmbeddedId;
import lombok.Data;

@Data 
@Entity
public class Enseignement {

    @EmbeddedId
    private EseignementId eId = new EseignementId();
    private int annee;
}
