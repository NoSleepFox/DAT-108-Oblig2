package oppgave3;

import java.util.concurrent.atomic.AtomicInteger;

public class Hamburger {

    private static final AtomicInteger teller = new AtomicInteger(0);

    private final int nummer;

    public Hamburger(){
        this.nummer = teller.incrementAndGet();
    }
    public int getNummer(){
        return nummer;
    }

    @Override
    public String toString(){
        return "◖" + nummer + "◗";
    }
}
