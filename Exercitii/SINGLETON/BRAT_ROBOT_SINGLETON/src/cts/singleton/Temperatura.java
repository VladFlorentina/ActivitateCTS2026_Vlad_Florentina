package cts.singleton;

public class Temperatura implements RoboticArmConection{

    private  static Temperatura instance=null;

    private Temperatura() {
    }

    public static synchronized Temperatura getInstance(){
        if(instance==null){
            instance=new Temperatura();
        }
        return instance;
    }

    @Override
    public void conectare() {
        System.out.println("conectata la TEMPERATURA");
    }
}
