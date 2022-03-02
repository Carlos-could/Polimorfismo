
package getraenke;


public class Tequila extends Spirituose {
    private String farbe;

    public Tequila(String farbe, float alkoholgehalt, float volumen) {
        super(alkoholgehalt, volumen);
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return super.toString()+ "Tequila{" +
                "farbe='" + farbe + '\'' +
                '}';
    }

    public void wasBinIch(){
        System.out.println("Ich bin ein Tekila");
    }
}