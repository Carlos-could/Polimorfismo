package getraenke;

public interface Schuettelbar {

    default void schütteln(){
        System.out.println("geschüttelt !");
    }

}