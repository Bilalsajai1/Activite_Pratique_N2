package ma.enset.activite_pratique_n2.repositories;

import ma.enset.activite_pratique_n2.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom); //On suppose que le nom est unique
}
