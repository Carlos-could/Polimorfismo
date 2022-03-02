package getraenke;


public class Apfelsaft extends Saft{
    private  String truebung;

    public Apfelsaft(String truebung, boolean fruchtfleisch, float volumen) {
        super(fruchtfleisch, volumen);
        this.truebung = truebung;
    }

    @Override
    public String toString() {
        return super.toString() + "Apfelsaft{" +
                "truebung='" + truebung + '\'' +
                '}';
    }

    public void wasBinIch(){
        System.out.println("Ich bin ein Apfelsaft");
    }
}