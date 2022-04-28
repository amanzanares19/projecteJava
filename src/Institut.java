import java.util.ArrayList;
import java.util.List;

public class Institut {
    private String nom;

    private List<Persona> personas = new ArrayList<Persona>();

    public Institut(String nom){
        this.nom = nom;
        System.out.println(nom);
    }
    
    /* Código redundante
    public void afegirProfe(Professor profe) {
        this.personas.add(profe);
        
    }
    
    
    public void afegirEstudiant(Estudiant estudiant) {
        this.personas.add(estudiant);
    } 
    */

    public void afegirPersona(Persona person) {
        this.personas.add(person);
    }

    
    public void imprimirInformacio() {
        for (Persona persona : personas) {
            System.out.println(persona.obtenirDades());
        }
    }
}