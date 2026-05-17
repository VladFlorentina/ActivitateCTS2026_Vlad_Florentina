package cts.clase;

public class ReceptieSpitalFacade {

    //pas 1
    private Medic medic;
    private Salon salon;

    //pas 2 const
    public ReceptieSpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    //pas 3
    public void interneazaPacient(Pacient p)
    {
        //pas A intrebam medicul daca aproba trimiterea
        if(this.medic.areTrimitere(p)){
            //pas B cautam pat liber
            int patLiber=this.salon.getPatLiber();
            //pas C daca e loc il interbam
            if(patLiber!=-1){
                System.out.println("pacientul "+p.getNume()+" va fi internat");
                this.salon.ocupaPat(patLiber);
            }else{
                System.out.println("nu EX pat");
            }
        }
        else {
            System.out.println("ai nevoie de trimitere pt pacientl "+p.getNume());
        }
    }
}
