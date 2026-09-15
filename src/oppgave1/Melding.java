package oppgave1;

public class Melding {

    private String melding = "Hello World";

    public synchronized String getMelding() {
        return melding;
    }

    public synchronized void setMelding(String melding) {
        this.melding = melding;
    }
}
