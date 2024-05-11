package tn.itbs.tp0.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.itbs.tp0.models.Groupe;


@Repository


public interface GroupeRepository extends JpaRepository<Groupe, Integer> {
}
