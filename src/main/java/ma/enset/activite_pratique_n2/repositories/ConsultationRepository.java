package ma.enset.activite_pratique_n2.repositories;

import ma.enset.activite_pratique_n2.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
