package cts.clase;

public class AutobuzNoapte implements MijlocTransport{

    private MijlocTransport mijlocTransport;

    public AutobuzNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresetStatie(Statie s) {
        if(s.getNrCalatori()>0 || this.mijlocTransport.getNrCalatori()>0){
            this.mijlocTransport.opresetStatie(s);
        }else{
            System.out.println("nu opreste in statia"+s.getNumeStatie());
        }
    }

    @Override
    public int getNrCalatori() {
        return this.mijlocTransport.getNrCalatori();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocTransport.getTipCursa();
    }
}
