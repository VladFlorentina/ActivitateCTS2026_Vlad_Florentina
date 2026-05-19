package cts.clase;

public class ComandaRezervare implements Command {
    private Masa masa;

    public ComandaRezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        this.masa.rezervaMasa();
    }
}
