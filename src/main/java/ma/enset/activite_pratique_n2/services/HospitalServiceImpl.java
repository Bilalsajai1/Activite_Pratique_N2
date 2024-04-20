package ma.enset.activite_pratique_n2.services;

import jakarta.transaction.Transactional;
import ma.enset.activite_pratique_n2.entities.Consultation;
import ma.enset.activite_pratique_n2.entities.Medecin;
import ma.enset.activite_pratique_n2.entities.Patient;
import ma.enset.activite_pratique_n2.entities.RendezVous;
import ma.enset.activite_pratique_n2.repositories.ConsultationRepository;
import ma.enset.activite_pratique_n2.repositories.MedecinRepository;
import ma.enset.activite_pratique_n2.repositories.PatientRepository;
import ma.enset.activite_pratique_n2.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private ConsultationRepository consultationRepository;
    private RendezVousRepository rendezVousRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, ConsultationRepository consultationRepository, RendezVousRepository rendezVousRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezVousRepository = rendezVousRepository;
    }


    @Override
    public Patient savePatient(Patient patient) {

        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
