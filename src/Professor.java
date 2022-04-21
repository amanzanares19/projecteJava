public class Professor extends Persona{
    private double sou;

    public void canviarSou(double nouSou) {
        if (nouSou <= 3000.0) {
            this.sou = nouSou;
        } else {
            System.out.println("Els profes han de cobrar menys de 3000");
        }
            
    }

    public String obtenirDades() {
        return super.obtenirDades() + "(Professor amb sou: " + sou + ") ";
    }
}
