package oppgave3;

import java.rmi.UnexpectedException;
import java.util.concurrent.ThreadLocalRandom;

public class Servitor extends Thread{
    private final HamburgerBrett brett;

    public Servitor(HamburgerBrett brett, String navn){
        super(navn);
        this.brett = brett;
    }

    @Override
    public void run(){
        try{
            while(true) {
                Thread.sleep(ThreadLocalRandom.current().nextInt(2000, 6001));
                Hamburger hamburger = brett.taAv();
                System.out.println(getName() + " (servitør) tar av hamburger"+ hamburger + ". Brett "+ brett);
            }
        }
        catch(InterruptedException e){

        }
    }
}
