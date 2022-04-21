public class Persona {
    
    private String dni;
    
    private String nom;

    /* testing
    public Persona() {
        dni = "Ejemplo";
        nom = "Anonimo";        
    } */
   

    public void canviarNom(String nom) {
        this.nom = nom;
    }
    

    public void assignarDni(String dni) throws Exception {
        
        if (this.dni == null) {
            
            if (dni.length() == 9) {
                this.dni = dni;
            } else {
                throw new Exception("La longitud del dni debe ser 9");
            }
            
        } else {
            throw new Exception("El dni no es pot canviar");
        }
        
    }

    public String obtenirDades() {

        if (nom == null || nom.isEmpty()) {
            throw new NullPointerException("Falta indicar el nom");
        }

        if (dni == null || dni.isEmpty()) {
            throw new NullPointerException("Falta indicar el dni");
        }

        return "Persona que es diu: " + nom + " amb DNI: " + dni;
    }

}
