public class App {
    public static void main(String[] args) throws Exception {
        
        
        /*
        Persona p = new Persona();
         
        p.canviarNom("Alex");
        p.assignarDni("6209182F");
       
        System.out.println(p.obtenirDades()); 
        */

        Professor profe = new Professor();
        profe.canviarNom("Marc");
        profe.assignarDni("39436208Q");
        profe.canviarSou(2000.0);
        System.out.println(profe.obtenirDades() + "\n");
        
        Estudiant e = new Estudiant();
        e.canviarNota(6.5);
        e.canviarNom("Alex");
        e.assignarDni("62091823F");

        System.out.println(e.obtenirDades() + "\n");

        ProfessorSubstitut s = new ProfessorSubstitut();
        s.canviarNom("German");
        s.assignarDni("24985464L");
        s.canviarSou(2000.0);
        s.assignarSubstitucio("24/10/2019", "13/05/2022");;

        System.out.println(s.obtenirDades() + "\n");

        Institut ins = new Institut("La Guineueta");
    }
}
