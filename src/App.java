import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Persona p = new Persona();
         
        p.canviarNom("Alex");
        p.assignarDni("6209182F");
       
        System.out.println(p.obtenirDades()); 
        */
        Date dataFi = new Date(2022, 4, 15);
        Date dataInici = new Date(2019, 4, 10);

        Professor profe = new Professor();
        profe.canviarNom("Marc");
        profe.assignarDni("39436208Q");
        //Dar error a proposito del intento de modificacion de dni
        /* profe.assignarDni("39436208N"); */

        profe.canviarSou(1800.0);
        /* System.out.println(profe.obtenirDades() + "\n"); */
        
        Estudiant e = new Estudiant();
        e.canviarNota(6.5);
        e.canviarNom("Alex");
        e.assignarDni("62091823F");

        /* System.out.println(e.obtenirDades() + "\n"); */

        ProfessorSubstitut s = new ProfessorSubstitut();
        s.canviarNom("German");
        s.assignarDni("24985464L");
        s.canviarSou(2000.0);

        s.assignarSubstitucio(dataInici, dataFi);

        Institut ins = new Institut("La Guineueta");

        ins.afegirProfe(profe);
        ins.afegirEstudiant(e);
        ins.imprimirInformacio();
        System.out.println(s.obtenirDades() + "\n");
    }
}