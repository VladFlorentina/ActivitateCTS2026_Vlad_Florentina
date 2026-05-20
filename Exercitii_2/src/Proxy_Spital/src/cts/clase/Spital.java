package cts.clase;

public class Spital implements SpitalAbstract{
    private String numeS;

    public Spital(String numeS) {
        this.numeS = numeS;
    }



    @Override
    public void interneaza(Pacient p) {
        System.out.println("pacientu a fost internat la spitalul "+this.numeS);
    }
}
