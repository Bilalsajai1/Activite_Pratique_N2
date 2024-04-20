package ma.enset.activite_pratique_n2.services;

import ma.enset.activite_pratique_n2.entities.Consultation;
import ma.enset.activite_pratique_n2.entities.Medecin;
import ma.enset.activite_pratique_n2.entities.Patient;
import ma.enset.activite_pratique_n2.entities.RendezVous;

public interface IHospitalService {

    //Save operations
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);


}
