package oppgave3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class HamburgerBrett {
    private final BlockingQueue<Hamburger> brett;

    public HamburgerBrett(int kapasitet){
        brett = new ArrayBlockingQueue<>(kapasitet);
    }
    public void leggTil(Hamburger hamburger) throws InterruptedException{
        brett.put(hamburger);
    }
    public Hamburger taAv() throws InterruptedException{
        return brett.take();
    }
    @Override
    public String toString(){
        return brett.toString();
    }
}
