package cts.clase.spital;

public class Medicament {
    private String nume;
    private float pret;


    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()){
            System.out.println("medicamentul x a fist cumparat");
        }else{
            System.out.println("nu a prezentat reteta");
        }
    }

    public boolean prezintaReteta(){return this.nume.length()>10;}
    public  String getNume(){return nume;}
}


