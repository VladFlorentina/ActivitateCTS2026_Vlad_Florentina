package cts.clase;

public class ComandaOcupare implements  Command{

    private Masa m;

    public ComandaOcupare(Masa m) {
        this.m = m;
    }

    @Override
    public void executa() {
        this.m.ocupaMasa();
    }
}
