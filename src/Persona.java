public class Persona {
    
    private String dni;
    
    private String nom;

    public Persona(){
        
        dni = "anonimo";
        nom = "Anonimo";
    }

    public void canviarNom(String nom){
        this.nom = nom;
    }

    public void assignarDni(String dni){
        if (dni.length() == 9) {
            this.dni = dni;
        } else {
            System.out.println("Error, longitud del dni debe ser 9");
        }
    }


    public String obtenirDades(){
        return "Persona que es diu: " + nom + " amb DNI: " + dni;
    }
}
