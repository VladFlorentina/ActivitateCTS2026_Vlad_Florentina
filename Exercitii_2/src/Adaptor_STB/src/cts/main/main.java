package cts.main;

import cts.clase.Adaptor.Adapter;
import cts.clase.Metrou.BiletMetrou;
import cts.clase.Terestru.BiletTerestru;

public class main {

    public static void procesareMetrou(BiletMetrou bm){
        bm.validareMetrou();
    }

    public static void main(String[] args) {
        BiletMetrou b1=new BiletMetrou("b1");
        procesareMetrou(b1);

        BiletTerestru bt=new BiletTerestru("bt1");
        Adapter ad=new Adapter(bt);
        procesareMetrou(ad);

    }
}
