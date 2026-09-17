package oppgave2;

public class Kokk extends Thread {
    // kanskje noe sånt
    private HamburgerBrett brett;
    private String navn;

    public Kokk(HamburgerBrett brett, String navn) {
        this.brett = brett;
        this.navn = navn;
    }

    @Override
    public void run() {
        // Logikk her
    }
}
