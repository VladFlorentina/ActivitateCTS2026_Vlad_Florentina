package cts.prototype;

import java.util.ArrayList;
import java.util.List;

public class Rezervare implements Irezervare{

    private String numeClient;
    private  List<String> preferinte;

    public Rezervare(String numeClient, List<String> preferinte) {
        this.numeClient = numeClient;
        this.preferinte = new ArrayList<>(preferinte);
    }

    public Rezervare() {
        this.preferinte = new ArrayList<>();
    }



    @Override
    public Irezervare clone() {
        Rezervare copie=new Rezervare();
        copie.numeClient=this.numeClient;
        for(String c: this.preferinte){
            copie.preferinte.add(c);
        }
        return copie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", preferinte=").append(preferinte);
        sb.append('}');
        return sb.toString();
    }
}
