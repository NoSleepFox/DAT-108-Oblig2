package oppgave1;

import javax.swing.*;

public class MeldingBoks extends Thread {

    private Melding melding;

    public MeldingBoks(Melding melding) {

        this.melding = melding;
    }

    @Override
    public void run() {
        while (!melding.getMelding().toLowerCase().equals("quit")) {
            String tekst = JOptionPane.showInputDialog("Skriv en melding:");
            if (tekst != null) {
                melding.setMelding(tekst);
            }
        }
    }
}
