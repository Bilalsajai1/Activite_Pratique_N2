package ma.enset.activite_pratique_n2.repositories;

import ma.enset.activite_pratique_n2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByNom(String nom); //On suppose que le nom est unique
}
