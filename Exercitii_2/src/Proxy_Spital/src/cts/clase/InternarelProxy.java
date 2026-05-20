package cts.clase;

public class InternarelProxy implements SpitalAbstract{

    private SpitalAbstract sp;

    public InternarelProxy(SpitalAbstract sp) {
        this.sp = sp;
    }

    @Override
    public void interneaza(Pacient p) {
        if(p.isAreTrimitere()){
            this.sp.interneaza(p);
            System.out.println("pacientul "+p.getNume()+" a fost internat");
        }else{
            System.out.println("necesita trimitere");
        }
    }
}
