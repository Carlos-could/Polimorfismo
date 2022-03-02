
package getraenke;


public class Wodka extends Spirituose {
    private String aroma;

    public Wodka(String aroma, float alkoholgehalt, float volumen) {
        super(alkoholgehalt, volumen);
        this.aroma = aroma;
    }


    @Override
    public String toString() {
        return super.toString() + "Wodka{" +
                "aroma='" + aroma + '\'' +
                '}';
    }

    public void wasBinIch(){
        System.out.println("Ich bin ein Wodka");
    }
}