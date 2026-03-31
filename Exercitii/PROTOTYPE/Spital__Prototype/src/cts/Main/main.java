package cts.Main;

import cts.prototype.RegistruReteta;
import cts.prototype.Reteta;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> compozitie=new ArrayList<>();
        compozitie.add("apa");
        compozitie.add("otet");

        Reteta r1=new Reteta("aspacard",compozitie);

        RegistruReteta registr=new RegistruReteta();
        registr.adaugaRegistru("reteta1",r1);
        Reteta r2=(Reteta) registr.getPreset("reteta1");
    }
}
