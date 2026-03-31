package cts.singleton;

public class Internet implements RoboticArmConection{

    private static Internet instance=null;

    private Internet() {
    }

    public static synchronized Internet getInstance(){
        if(instance==null){
            instance=new Internet();
        }
        return instance;
    }

    @Override
    public void conectare() {
        System.out.println("conectata la internet");
    }
}
