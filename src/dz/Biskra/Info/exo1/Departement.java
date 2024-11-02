package dz.Biskra.Info.exo1;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String specialite;
    private String adresse;
    private List<Etudiant> etudiants;

    // Constructor
    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiants = new ArrayList<>();
    }

    // Method to add a student
    public void inscrire(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    // Method to remove a student
    public void desinscrire(Etudiant etudiant) {
        etudiants.remove(etudiant);
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departement: ").append(specialite).append("\nAdresse: ").append(adresse).append("\nEtudiants inscrits:\n");
        for (Etudiant etudiant : etudiants) {
            sb.append(etudiant).append("\n");
        }
        return sb.toString();
    }
}
