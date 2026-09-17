package oppgave3;

import java.util.Arrays;


public class main {
    public static void main (String []args){
        final String[] kokker = {"Chris","Eddie","Simen"};
        final String[] servitorer = {"Gundersen","Dalland"};
        final int KAPASITET = 4;

        skrivUtHeader(kokker,servitorer,KAPASITET);

        HamburgerBrett brett = new HamburgerBrett(KAPASITET);

        for (String navn : kokker){
            new Kokk(brett,navn).start();
        }
        for (String navn : servitorer){
            new Servitor(brett,navn).start();
        }
    }
    private static void skrivUtHeader(String[] kokker, String[] servitorer, int kapasitet){
        System.out.println("I denne simuleringen har vi");
        System.out.println("\t" + kokker.length + " kokker "+ Arrays.toString(kokker));
        System.out.println("\t" + servitorer.length + " servitører " + Arrays.toString(servitorer));
        System.out.println("\tKapasitet til brettet er " + kapasitet + " hamburgere.");
        System.out.println("Vi starter... \n");
    }

}
