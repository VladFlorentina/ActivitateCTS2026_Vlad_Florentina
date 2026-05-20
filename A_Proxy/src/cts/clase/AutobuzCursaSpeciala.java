package cts.clase;

public class AutobuzCursaSpeciala implements MijlocTransport{

    private MijlocTransport mijlocTransport;

    public AutobuzCursaSpeciala(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresetStatie(Statie s) {
        if(this.mijlocTransport.getTipCursa()==TipCursa.SPECIALA){
            System.out.println("nu opreste in statiile STB");
        }else{
            this.mijlocTransport.opresetStatie(s);
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
