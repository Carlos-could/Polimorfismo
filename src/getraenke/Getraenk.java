package getraenke;


public abstract class Getraenk {
    private float volumen; // in milliliter ml

    public Getraenk(float volumen) {
        this.volumen = volumen;
    }

    public float getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return "Getraenk{" +
                "volumen=" + volumen +
                '}';
    }

    public void wasBinIch(){
        System.out.println("Ich bin ein Getraenke");
    }

}