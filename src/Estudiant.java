public class Estudiant extends Persona{
    private double nota;

    public void canviarNota(double nota) {
        if (nota <= 10 && nota >= 0) {
            this.nota = nota;
        } else {
            System.out.println("La nota es entre 0 y 10");
        }
    }

    
    public String obtenirDades() {
        return super.obtenirDades() + "(Estudiant amb nota: " + nota + ")";
    }
}
