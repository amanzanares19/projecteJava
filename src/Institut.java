import java.util.ArrayList;
import java.util.List;


public class Institut {

    private String nom;

    private List<Persona> personas = new ArrayList<Persona>();
    
    public Institut(String nom){
        this.nom = nom;
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

        System.out.println(this.nom + ". Llista de persones: ");

        if (personas.size() > 0) {
            for (Persona persona : personas) {
                System.out.println(persona.obtenirDades());
            }
        } else {
            System.out.println("Encara no té persones assignades");
        }
        
    }

    //Listar institutos
    public void imprimirNoms() {
        System.out.println(this.nom);
    }
    
}