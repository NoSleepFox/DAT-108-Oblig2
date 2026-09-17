package oppgave2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String[] kokker = {"Anne", "Erik", "Knut"};
        final String[] servitorer = {"Mia", "Per"};
        final int KAPASITET = 4;

        skrivUtHeader(kokker, servitorer, KAPASITET);

        HamburgerBrett brett = new HamburgerBrett(KAPASITET);

        for (String navn : kokker) {
            new Kokk(brett, navn).start();
        }
        for (String navn : servitorer) {
            new Servitor(brett, navn).start();
        }
    }

    public static void skrivUtHeader(String[] kokker, String[] servitorer, int KAPASITET) {
        System.out.println("I denne simuleringen har vi");
        System.out.println("    " + kokker.length + " Kokker: " + Arrays.toString(kokker));
        System.out.println("    " + servitorer.length + " Servitorer: " + Arrays.toString(servitorer));
        System.out.println("    Kapasiteten til brettet er " +  KAPASITET + " hamburgere.");
        System.out.println("Vi starter");
    }
}
