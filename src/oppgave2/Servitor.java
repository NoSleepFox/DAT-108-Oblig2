package oppgave2;

public class Servitor extends Thread {
    // kanskje noe sånt
    private HamburgerBrett brett;
    private String navn;

    public Servitor(HamburgerBrett brett, String navn) {
        this.brett = brett;
        this.navn = navn;
    }

    @Override
    public void run() {
        // Logikk her
    }
}
