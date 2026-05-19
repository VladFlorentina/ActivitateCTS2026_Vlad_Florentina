package cts.clase;

public class Medic {
    private String numeMedic;

    public Medic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public void internarePacient(Pacient p){
        System.out.println("medicul "+this.numeMedic+" interneaza pacientul "+p.getNume());

    }

    public void tratareImediata(Pacient p){
        System.out.println("medicul "+this.numeMedic+" trateaza pacientul "+p.getNume());

    }
}
