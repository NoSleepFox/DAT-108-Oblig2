package oppgave2;

import java.util.Random;

public class Kokk extends Thread {

    private HamburgerBrett brett;
    private String navn;

    public static int nesteNummer = 1;

    public Kokk(HamburgerBrett brett, String navn) {
        this.brett = brett;
        this.navn = navn;
    }

    @Override
    public void run() {

        Random random = new Random();

        while (true) {
            try {
                int ventetid = random.nextInt(5) + 2;
                Thread.sleep(ventetid * 1000);

                Hamburger hamburger;

                synchronized (Kokk.class) {
                    hamburger = new Hamburger(nesteNummer);
                    nesteNummer++;
                }

                    brett.leggPaa(hamburger, navn);
            }   catch (InterruptedException e) {
                return;
            }
        }
    }
}
