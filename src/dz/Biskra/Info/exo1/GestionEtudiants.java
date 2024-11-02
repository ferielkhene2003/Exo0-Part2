package dz.Biskra.Info.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        // Create an instance of Etudiant
        Etudiant lolo = new Etudiant("Lolo", "Dupont", LocalDate.of(2000, Month.JANUARY, 15), "lolo@example.com", "123 Main St");
        System.out.println(lolo);

        // Create another instance of Etudiant with the same attributes
        Etudiant toto = new Etudiant("Lolo", "Dupont", LocalDate.of(2000, Month.JANUARY, 15), "lolo@example.com", "123 Main St");

        // Compare lolo and toto
        System.out.println("Comparing lolo and toto using '==': " + (lolo == toto));  // Should print false

        // Set toto to reference lolo
        toto = lolo;
        toto.setNom("Toto");

        // Check if changes in toto reflect in lolo
        System.out.println("After renaming toto to 'Toto':");
        System.out.println("Lolo: " + lolo);
        System.out.println("Toto: " + toto);  // Both should show the name "Toto"
        //************************************************************************************
        //************************************************************************************
        // Create additional students
        Etudiant fifi = new Etudiant("Fifi", "Lemoine", LocalDate.of(1999, Month.MARCH, 22), "fifi@example.com", "456 Elm St");
        Etudiant riri = new Etudiant("Riri", "Martin", LocalDate.of(1998, Month.APRIL, 10), "riri@example.com", "789 Maple St");

        // Create a department and enroll students
        Departement monDepInfo = new Departement("Informatique", "Université de Biskra");
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(riri);

        System.out.println("Department before removing Toto:");
        System.out.println(monDepInfo);

        // Unenroll toto (who is the same reference as lolo)
        monDepInfo.desinscrire(toto);

        System.out.println("Department after removing Toto:");
        System.out.println(monDepInfo);
    }
}
