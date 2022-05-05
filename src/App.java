import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {

    //Lista de institutos tercer parte
    private static List<Institut> instituts = new ArrayList<Institut>();
    
    static Scanner sc = new Scanner(System.in);
    static Scanner st = new Scanner(System.in);
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
        
        //Añadir personas a la lista para luego mostrarla
        ins.afegirPersona(profe);
        ins.afegirPersona(e);
        ins.afegirPersona(s);
        ins.imprimirInformacio();
        System.out.println();

        //Tercera part (Opcional)
        showMenu();

    }

    private static void showMenu() throws Exception {

        System.out.println("Introdueix el número de l'acció que vols fer");
        System.out.println("0) Terminar programa");
        System.out.println("1) Veure lista d'insitituts");
        System.out.println("2) Veure informació completa d'un institut");
        System.out.println("3) Afegir persona a un institut");
        System.out.println("4) Eliminar un Institut");
        System.out.println("5) Crear un Institut");

        int num = sc.nextInt();
        while (num < 0 || num > 5) {
            System.out.println("El numero debe ser entre 1 y 5");
            num = sc.nextInt();
        }

        while (num != 0) {
            
            switch (num) {
                case 0:
                    System.out.println("Fin del programa");
                    sc.close();
                    st.close();
                    break;
                case 1:
                    llistaInstitut();
                    break;

                case 2:
                    consultaInstitut();
                    break;
                case 3:
                    addPersonaToInstitut();
                    break;
                
                case 4:
                    removeInstitut();
                    break;
                
                case 5:
                    System.out.println("Escriu el nom de l'institut que vols crear:");
                    instituts.add(new Institut(st.nextLine()));
                    System.out.println("Institut creat correctament.");
                    break;
            }

            System.out.println("\nIntrodueix el número de l'acció que vols fer");
            System.out.println("0) Terminar programa");
            System.out.println("1) Veure lista d'insitituts");
            System.out.println("2) Veure informació completa d'un institut");
            System.out.println("3) Afegir persona a un institut");
            System.out.println("4) Eliminar un Institut");
            System.out.println("5) Crear un Institut");

            num = sc.nextInt();
        }

    }

    private static int checkInstitut() {

        if (instituts.size() > 0) {
            return 1;
        } else {
           System.out.println("Encara no hi ha cap institut");
           return 0;
        }

    }

    private static void removeInstitut() {

        if (checkInstitut() == 1) {
            System.out.println("Escriu el número de l'institut que vols eliminar:");
            int rm = sc.nextInt();
            
            if (rm >= 0 && rm < instituts.size()) {

                instituts.remove(rm);
                System.out.println("Insitut eliminat");

            } else {
                System.out.println("El número ha de ser com a mínim 0 i màxim la quantitat d'instituts");
            }
        }

    }

    private static void llistaInstitut(){
        if (checkInstitut() == 1) {
            int i = 0;
            
            for (Institut ins : instituts) {
                System.out.print(i + " - ");
                ins.imprimirNoms();
                i++;
            }

        } 
    }

    private static void consultaInstitut(){
        if (checkInstitut() == 1) {
            
            System.out.println("Escribe el número de l'institut que vols consultar");
            int position = sc.nextInt(); 

            while (position < 0 || position >= instituts.size()) {
                System.out.println("El numero debe estar en la lista de institutos");
                position = sc.nextInt();
            }

            instituts.get(position).imprimirInformacio();

            /* Other way 
            for (int i = 0; i < instituts.size(); i++) {
                if (i == position) {
                instituts.get(i).imprimirInformacio(); 
                }
            } */

        }
    }

    private static void addPersonaToInstitut() throws Exception {

        if (checkInstitut() == 1) {
            
            System.out.println("Escribe el número de l'institut que vols editar");
    
            int position = sc.nextInt(); 
            
            while (position < 0 || position >= instituts.size()) {
                System.out.println("El numero debe estar en la lista de institutos");
                position = sc.nextInt();
            }

            for (int i = 0; i < instituts.size(); i++) {
                if (i == position) {
                   
                    System.out.println("Introdueix el número del tipus de persona que vols crear");
                    System.out.println("1) Estudiant");
                    System.out.println("2) Professor");
                    System.out.println("3) Substitut");
    
                    int num = sc.nextInt();

                    switch (num) {
                        case 1:
    
                            Estudiant e = new Estudiant();
                            System.out.println("DNI:");
                            String dniEst = st.nextLine();
                            
                            System.out.println("Nom: ");
                            String nomEst = st.nextLine();
    
                            System.out.println("Nota del alumne");
                            Double nota = sc.nextDouble();
    
                            e.assignarDni(dniEst);
                            e.canviarNom(nomEst);
                            e.posarNota(nota);
    
                            instituts.get(position).afegirPersona(e);
                            
                            break;
                        
                        case 2:
                            Professor p = new Professor();
                            System.out.println("DNI:");
                            String dniProfe = st.nextLine();
                            
                            System.out.println("Nom: ");
                            String nomProfe = st.nextLine();
    
                            System.out.println("Sou:");
                            Double sou = sc.nextDouble();
    
                            p.assignarDni(dniProfe);
                            p.canviarNom(nomProfe);
                            p.canviarSou(sou);
                            
                            instituts.get(position).afegirPersona(p);
                            break;    
                        
                        case 3:
                            ProfessorSubstitut ps = new ProfessorSubstitut();
                            System.out.println("DNI:");
                            String dniProfeS = st.nextLine();
                            
                            System.out.println("Nom: ");
                            String nomProfeS = st.nextLine();
    
                            System.out.println("Sou:");
                            Double souS = sc.nextDouble();

                            System.out.println("Indica la data d'inici y la de termini. (El patró ha de ser Any Mes Dia)");
                            ps.assignarSubstitucio(new Date(sc.nextInt(), sc.nextInt(), sc.nextInt() ), new Date(sc.nextInt(), sc.nextInt(), sc.nextInt()));

                            ps.assignarDni(dniProfeS);
                            ps.canviarNom(nomProfeS);
                            ps.canviarSou(souS);
                            
                            instituts.get(position).afegirPersona(ps);
                            break;

                        default:
                            System.out.println("No existeix el tipus de persona");
                            break;

                    }

                    System.out.println("Persona creada correctament");
                }
            }
        }
    }
    
}