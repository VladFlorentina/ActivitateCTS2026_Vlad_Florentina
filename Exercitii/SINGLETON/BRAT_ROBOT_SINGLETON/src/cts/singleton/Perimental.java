package cts.singleton;

public class Perimental implements RoboticArmConection{

    private static Perimental instance=null;

    private Perimental() {
    }

    public static synchronized Perimental getInstance(){
        if(instance==null){
            instance=new Perimental();
        }
        return instance;
    }

    @Override
    public void conectare() {
     System.out.println("conectata la perimetru");
    }
}
