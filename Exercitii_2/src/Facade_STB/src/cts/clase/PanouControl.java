package cts.clase;

public class PanouControl {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public PanouControl() {
        this.usaFata=new Usa("Fata");
        this.usaMijloc=new Usa("mijol");
        this.usaSpate=new Usa("spate");
    }

    public void PuneUsileInModLiber(){
        System.out.println("activare mod liber");
        this.usaFata.punModLiber();
        this.usaMijloc.punModLiber();
        this.usaSpate.punModLiber();
    }

    public void deschidereFortata(){
        System.out.println("activare desvhidere fortata");
        this.usaFata.deschideUsaFortat();
        this.usaMijloc.deschideUsaFortat();
        this.usaSpate.deschideUsaFortat();
    }
}
