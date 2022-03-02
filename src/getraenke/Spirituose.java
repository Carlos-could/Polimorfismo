package getraenke;


public class Spirituose extends Getraenk{

    private float alkoholgehalt;

    public Spirituose(float alkoholgehalt, float volumen) {
        super(volumen);
        this.alkoholgehalt = alkoholgehalt;
    }

    @Override
    public String toString() {
        return super.toString() + "Spirituose{" +
                "alkoholgehalt=" + alkoholgehalt +
                '}';
    }

    public void wasBinIch(){
        System.out.println("Ich bin ein Spirituose");
    }
}