package cts.Main;

import cts.singleton.Amasina;
import cts.singleton.IService;
import cts.singleton.Masina;
import cts.singleton.Service;

public class Main {
    public static void main(String[] args) {

        Amasina m1=new Masina("bc123","suv");
        Amasina m2=new Masina("vn123","tar");
        Amasina m3=new Masina("hj123","sedan");

        IService s1= Service.getInstance("service 1");
        IService s2= Service.getInstance("service 2");
        IService s3= Service.getInstance("service 3");

        System.out.println("instanta s1 :"+s1.hashCode());
        System.out.println("instanta s2 :"+s2.hashCode());
        System.out.println("instanta s3 :"+s3.hashCode());

        s1.adaugaMasina(m1);
        s1.adaugaMasina(m2);
        s1.iesireMasina();
        s1.adaugaMasina(m2);
    }
}
