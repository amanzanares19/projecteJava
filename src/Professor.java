public class Professor extends Persona{
    private double sou;

    public void canviarSou(double nouSou) throws ArithmeticException {
        if (nouSou > 3000.0) {
            throw new ArithmeticException("Té que cobrar menys de 3000");
        } else if(nouSou < 0) {
            throw new ArithmeticException("Té que cobrar valors positius");
        } else {
            this.sou = nouSou;
        }      
    }

    public String obtenirDades() {
        return super.obtenirDades() + "(Professor amb sou: " + sou + ") ";
    }
}
