package oppgave1;

public class SkrivUt extends Thread {

    private Melding melding;

    public SkrivUt(Melding melding) {

        this.melding = melding;
    }

    @Override
    public void run() {
        while (!melding.getMelding().toLowerCase().equals("quit")) {
            System.out.println(melding.getMelding());
            try {
                sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

}
