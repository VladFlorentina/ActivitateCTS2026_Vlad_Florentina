package cts.Main;

import cts.singleton.Abonament;
import cts.singleton.AbstractMembership;

public class main {
    private static Abonament abonamentThread;
    public static void main(String[] args) {

        AbstractMembership a1=Abonament.getInstance("Ion","standar");
        AbstractMembership a2=Abonament.getInstance("Maria","standar");
        AbstractMembership a3=Abonament.getInstance("Flori","standar");

        if(a1==a2 & a1==a3){
            System.out.println("aceasi instanta ");
        }

        System.out.println("refeinta a1 :"+a1.hashCode());
        System.out.println("refeinta a2 :"+a2.hashCode());
        System.out.println("refeinta a3 :"+a3.hashCode());

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                abonamentThread=Abonament.getInstance("SARA","STANDARD");
            }
        });

        t1.start();
        try{
            t1.join();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
