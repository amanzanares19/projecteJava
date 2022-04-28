import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona{
    
    private List<Double> notas = new ArrayList<Double>();

    /* public void canviarNota(double nota) throws ArithmeticException {
        if (nota > 10 || nota < 0) {
            throw new ArithmeticException("La nota ha de ser entre 0 y 10");
        } else {
            this.notas.add(nota);
        }
    } */

    public void posarNota(double nota) throws ArithmeticException {
        if (nota > 10 || nota < 0) {
            throw new ArithmeticException("La nota ha de ser entre 0 y 10");
        } else {
            this.notas.add(nota);
        }
    }

    
    public String obtenirDades() {

        double mean = 0;
        double minNota = 0;
        double maxNota = 0;
        String notas = "";

        for (Double n : this.notas) {

            if (minNota == 0 && maxNota == 0) {
            
                minNota = n;
                maxNota = n;

            }

            if (n > maxNota) {
                maxNota = n;
            } else if (n < minNota) {
                minNota = n;
            }

            mean += n;
            notas += n + " ";
        }

        mean = mean / this.notas.size();

        //Obtenció de nota màxima, mínima y mitjana
        return super.obtenirDades() + "(Estudiant amb nota màxima: " + maxNota + ", nota mínima: " + minNota + " i amb una mitjana de: " + mean + ")." + " Totes les notes: " + notas;
    }
}
