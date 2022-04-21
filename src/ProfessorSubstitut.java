import javax.xml.crypto.Data;

public class ProfessorSubstitut extends Professor {

    private String dataInici;
    private String dataFi;

    public void assignarSubstitucio(String dataInici, String dataFi) {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public String obtenirDades() {
        return super.obtenirDades() + "Data de quan va començar el sustitut: " + dataInici + " i quan terminará: " + dataFi;
    }
}