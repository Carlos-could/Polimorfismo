package getraenke;

import getraenke.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Saft asaft = new Apfelsaft("trüb", false, 250.0f);
//        System.out.println(asaft.toString());
//        asaft.schütteln();
//
//        Saft ksaft =new Kiwisaft(true, 250.0f);
//        System.out.println(ksaft.toString());
//        ksaft.schütteln();
//
//        Spirituose tspiri = new Tequila("golden",0.4f, 20.0f);
//        System.out.println(tspiri.toString());
//        // FEHLER tspiri.schütteln(); // Die  Methode gibt es nicht!
//
//        Spirituose wspiri = new Wodka("Cherry",0.5f, 20.0f);
//        System.out.println(wspiri.toString());

        Tequila tt = new Tequila("golden",0.4f, 20.0f);
//        Tequila tw = new Wodka("Cherry",0.5f, 20.0f);
//        Tequila ta = new Apfelsaft("trüb", false, 250.0f);
//        Tequila tk = new Kiwisaft(true, 250.0f);
//        Tequila ts = new Saft();
//        Tequila tsp = new Spirituose();
//        Tequila tg = new Getraenk();

        //Wodka wt = new Tequila("golden",0.4f, 20.0f);
        Wodka ww = new Wodka("Cherry",0.5f, 20.0f);
//        Wodka wa = new Apfelsaft("trüb", false, 250.0f);
//        Wodka wk = new Kiwisaft(true, 250.0f);
//        Wodka ws = new Saft();
//        Wodka wsp = new Spirituose(40f,300);
//        Wodka wg = new Getraenk();

//        Apfelsaft at = new Tequila("golden",0.4f, 20.0f);
//        Apfelsaft aw = new Wodka("Cherry",0.5f, 20.0f);
        Apfelsaft aa = new Apfelsaft("trüb", false, 250.0f);
//        Apfelsaft ak = new Kiwisaft(true, 250.0f);
//        Apfelsaft as = new Saft();
//        Apfelsaft asp = new Spirituose(40f,300);
//        Apfelsaft ag = new Getraenk();

//        Kiwisaft kt = new Tequila("golden",0.4f, 20.0f);
//        Kiwisaft kw = new Wodka("Cherry",0.5f, 20.0f);
//        Kiwisaft ka = new Apfelsaft("trüb", false, 250.0f);
        Kiwisaft kk = new Kiwisaft(true, 250.0f);
//        Kiwisaft ks = new Saft();
//        Kiwisaft ksp = new Spirituose(40f,300);
//        Kiwisaft kg = new Getraenk();

        tt.wasBinIch();
        ww.wasBinIch();
        aa.wasBinIch();
        kk.wasBinIch();

        System.out.println("-------------");
        Wodka w1 = new Wodka("Cherry",0.5f, 0.2f);
        Tequila t1 = new Tequila("golden",0.4f, 0.3f);
        Kiwisaft k1 = new Kiwisaft(true, 0.25f);

        ArrayList<Getraenk> drink = new ArrayList<>();
        drink.add(w1);
        drink.add(t1);
        drink.add(k1);


        for (Getraenk d : drink){
            d.wasBinIch();
        }
        k1.schütteln();








    }
}