package cts.prototype;

import java.util.HashMap;

public class RegistruReteta {

    private HashMap<String,IReteta> presetat=new HashMap<>();

    public void   adaugaRegistru(String cheie,IReteta r){
        presetat.put(cheie,r);
    }

    public IReteta getPreset(String cheie){
        if(presetat.containsKey(cheie)){
            return presetat.get(cheie).clone();
        }
            return null;
    }
}
