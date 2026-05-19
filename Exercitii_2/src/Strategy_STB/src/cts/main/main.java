package cts.main;

import cts.clase.Client;
import cts.clase.PlataCash;

public class main {
    public static void main(String[] args) {
        Client c1=new Client("ion");
        c1.setModPlata(new PlataCash());
        c1.plataBilet();
    }
}
