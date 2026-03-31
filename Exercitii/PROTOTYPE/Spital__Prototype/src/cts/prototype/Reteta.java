package cts.prototype;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta{

    private String numeMedicament;
    private List<String>incrediente;

    public Reteta(String numeMedicament ,List<String> incrediente) {
        this.numeMedicament = numeMedicament;
        this.incrediente = new ArrayList<>(incrediente);
    }

    public Reteta() {
        this.incrediente=new ArrayList<>();
    }

    @Override
    public IReteta clone() {
       Reteta copie=new Reteta();
       copie.numeMedicament=this.numeMedicament;
       for(String c:this.incrediente){
           copie.incrediente.add(c);
       }
       return copie;
    }
}
