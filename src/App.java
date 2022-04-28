import java.util.Date;
import java.util.Scanner;

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

        //Dar error a proposito del intento de persona sin nombre o dni
        /* profe.canviarNom(""); */
        /* profe.assignarDni(""); */

        //Dar error a proposito del intento de professor que cobra más de 3000€
        /* profe.canviarSou(3800.0); */

        profe.canviarSou(1800.0);
        /* System.out.println(profe.obtenirDades() + "\n"); */
        
        Estudiant e = new Estudiant();
        /* e.afegirNota(6.5); */
        e.posarNota(5.4);
        e.posarNota(6);
        e.posarNota(9);
        e.canviarNom("Alex");
        e.assignarDni("62091823F");
        /* System.out.println(e.obtenirDades() + "\n"); */

        //Dar error de nota superior a 10 o inferior a 0
        /* e.canviarNota(16.5); */

        ProfessorSubstitut s = new ProfessorSubstitut();
        s.canviarNom("German");
        s.assignarDni("24985464L");
        s.canviarSou(2000.0);

        s.assignarSubstitucio(dataInici, dataFi);

        Institut ins = new Institut("La Guineueta");

        /* Código redundante
        ins.afegirProfe(profe);
        ins.afegirEstudiant(e); 
        */

        ins.afegirPersona(profe);
        ins.afegirPersona(e);
        ins.afegirPersona(s);
        ins.imprimirInformacio();

    }
}