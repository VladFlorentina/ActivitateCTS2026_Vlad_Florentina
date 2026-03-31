package cts.main;

import cts.singleton.Internet;
import cts.singleton.Perimental;
import cts.singleton.RoboticArmConection;
import cts.singleton.Temperatura;

public class Main {
    public static void main(String[] args) {


        RoboticArmConection c1=Perimental.getInstance();
        RoboticArmConection c2= Internet.getInstance();
        RoboticArmConection c3= Temperatura.getInstance();

        RoboticArmConection c4=Perimental.getInstance();
        c1.conectare();
        c2.conectare();
        c3.conectare();

       if(c1==c4){
           System.out.println("aceasi instanta");
       }

       System.out.println("c1 : "+c1.hashCode());
        System.out.println("c2 : "+c2.hashCode());
        System.out.println("c3 : "+c3.hashCode());
        System.out.println("c4 : "+c4.hashCode());
    }
}
