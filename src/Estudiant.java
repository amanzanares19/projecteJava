public class Estudiant extends Persona{
    private double nota;

    public void canviarNota(double nota) throws ArithmeticException {
        if (nota > 10 || nota < 0) {
            throw new ArithmeticException("La nota ha de ser entre 0 y 10");
        } else {
            this.nota = nota;
        }
    }

    
    public String obtenirDades() {
        return super.obtenirDades() + "(Estudiant amb nota: " + nota + ")";
    }
}
