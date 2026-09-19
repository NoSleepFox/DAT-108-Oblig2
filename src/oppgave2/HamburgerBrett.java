package oppgave2;

import java.util.LinkedList;
import java.util.Queue;

public class HamburgerBrett {

    private int kapasitet;
    private Queue<Hamburger> hamburgere;

    public HamburgerBrett(int kapasitet) {
        this.kapasitet = kapasitet;
        this.hamburgere = new LinkedList<>();
    }

    public synchronized void leggPaa(Hamburger hamburger, String kokkNavn)
        throws InterruptedException {

        while (hamburgere.size() >= kapasitet) {
            System.out.println(kokkNavn + " (kokk) klar med hamburger, men brett fullt. Venter!");

            wait();
        }

        hamburgere.add(hamburger);

        System.out.println(kokkNavn + " (kokk) legger på hamburger" + hamburger + ". Brett: " + hamburgere);

        notifyAll();
    }

    public synchronized Hamburger taAv(String servitorNavn)
        throws InterruptedException {

        while (hamburgere.isEmpty()) {
            System.out.println(servitorNavn + " (servitør) ønsker å ta hamburger, men brett tomt. Venter!");

            wait();
        }

        Hamburger hamburger = hamburgere.poll();

        System.out.println(servitorNavn + " (servitør) tar av hamburger " + hamburger + ". Brett: " + hamburgere);

        notifyAll();
        return hamburger;
    }
}
