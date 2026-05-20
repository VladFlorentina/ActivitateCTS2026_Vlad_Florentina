package cts.clase;

public class Autobuz implements MijlocTransport{

    private int nrCalatori;
    private int nrLinie;
    private TipCursa tipCursa;

    public Autobuz(int nrCalatori, int nrLinie) {
        this.nrCalatori = nrCalatori;
        this.nrLinie = nrLinie;
        this.tipCursa = TipCursa.NORMALA;
    }

    public Autobuz(int nrCalatori, int nrLinie, TipCursa tipCursa) {
        this.nrCalatori = nrCalatori;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }


    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public void opresetStatie(Statie s) {
        System.out.println("autobuzul pe linia "+this.nrLinie+" a optit la "+s.numeStatie);
    }

    @Override
    public int getNrCalatori() {
        return this.nrCalatori;
    }

    @Override
    public TipCursa getTipCursa() {
        return this.tipCursa;
    }
}
