package oppgave1;

public class Main {
    
    public static void main(String[] args) {


        Melding melding = new Melding();

        Thread skriv = new SkrivUt(melding);
        Thread meldingBoks = new MeldingBoks(melding);


        skriv.start();
        meldingBoks.start();

    }

}
