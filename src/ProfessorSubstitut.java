
import java.util.Date;

public class ProfessorSubstitut extends Professor {

    private Date dataInici;
    private Date dataFi;

    public void assignarSubstitucio(Date dataInici, Date dataFi) {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public String obtenirDades() {
        return super.obtenirDades() + " Data de quan va començar el substitut: " + dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear() + " i quan terminará: " + dataFi.getDate() + "/" + dataFi.getMonth() + "/" + dataFi.getYear();
    }
}