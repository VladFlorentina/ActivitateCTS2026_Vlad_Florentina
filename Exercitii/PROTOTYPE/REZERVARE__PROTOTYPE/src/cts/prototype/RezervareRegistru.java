package cts.prototype;

import java.util.HashMap;

public class RezervareRegistru {

    private HashMap<String ,Irezervare> presetat=new HashMap<>();

    public void adaugaPreset(String cheie,Irezervare r){
        presetat.put(cheie,r);
    }

    public Irezervare getRegistru(String cheie){
        if(presetat.containsKey(cheie)){
            return presetat.get(cheie).clone();
        }
        return null;
    }
}
