package getraenke;


public class Kiwisaft extends Saft {

    public Kiwisaft(boolean fruchtfleisch, float volumen) {
        super(fruchtfleisch, volumen);
    }

    @Override
    public String toString() {
        return super.toString() + "Kiwisaft{}";
    }
    public void wasBinIch(){
        System.out.println("Ich bin ein Kiwisaft");
    }
}