package oppgave3;

import java.util.concurrent.ThreadLocalRandom;

public class Kokk extends Thread {
    private final HamburgerBrett brett;

    public Kokk(HamburgerBrett brett, String navn){
        super(navn);
        this.brett = brett;
    }
    @Override
    public void run(){
        try{
            while (true){
                Thread.sleep(ThreadLocalRandom.current().nextInt(2000,6001));
                Hamburger hamburger = new Hamburger();
                brett.leggTil(hamburger);
                System.out.println(getName()+" (kokk) legger på hamburger) " +hamburger+ ". Brett: "+ brett);
            }
        }
        catch(InterruptedException e){

        }
    }
}
