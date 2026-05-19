package cts.clase;

public class Tratare implements Command{
    private Medic m;
    private Pacient p;

    public Tratare(Medic m, Pacient p) {
        this.m = m;
        this.p = p;
    }

    @Override
    public void executa() {
        m.tratareImediata(p);
    }
}
