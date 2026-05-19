package cts.clase;

public class Internare implements Command{
    private Medic m;
    private Pacient p;

    public Internare(Medic m, Pacient p) {
        this.m = m;
        this.p = p;
    }

    @Override
    public void executa() {
        m.internarePacient(p);
    }
}
