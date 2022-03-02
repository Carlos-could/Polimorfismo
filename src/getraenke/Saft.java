package getraenke;


public abstract class Saft extends Getraenk implements Schuettelbar{
    // Attribute
    private boolean fruchtfleisch;

    // Methoden

    // Konstruktor
    public Saft(boolean fruchtfleisch, float volumen) {
        super(volumen);
        this.fruchtfleisch = fruchtfleisch;
    }

    // Getter/Setter
    public boolean getFruchtfleisch() {
        return fruchtfleisch;
    }




    @Override
    public String toString() {
        return super.toString() + "Saft{" +
                "fruchtfleisch=" + fruchtfleisch +
                '}';
    }

    public void wasBinIch(){
        System.out.println("Ich bin ein Saft");
    }
}