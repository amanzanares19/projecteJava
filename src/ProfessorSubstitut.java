
import java.util.Date;

public class ProfessorSubstitut extends Professor {

    private Date dataInici;
    private Date dataFi;

    public void assignarSubstitucio(Date dataInici, Date dataFi) {
        this.dataInici = new Date();
        this.dataFi = new Date();
    }

    public String obtenirDades() {
        return super.obtenirDades() + " Data de quan va començar el sustitut: " + dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear() + " i quan terminará: " + dataFi.getDate() + "/" + dataFi.getMonth() + "/" + dataFi.getYear();
    }
}