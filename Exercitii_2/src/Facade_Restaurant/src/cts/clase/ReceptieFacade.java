package cts.clase;

public class ReceptieFacade {
    private AranjareMasa am;
    private Sala s;
    private Debarasare d;

    public ReceptieFacade(AranjareMasa am, Sala s, Debarasare d) {
        this.am = am;
        this.s = s;
        this.d = d;
    }

    public void alocaMasaClient(Client c){
        //A
        int idMasa=s.getMasaLibera();
        if(idMasa==-1){
            System.out.println("nu avem mese libere pt "+c.getNume());
            return;
        }

        if(!d.esteDebarasata(idMasa)){
            System.out.println("masa "+idMasa+" etse libera dar nu e debarasata");
            return;
        }
        if(!am.asreServeteleNoi(idMasa)){
          System.out.println("masa "+idMasa+" este curata dar nu are servetele");
          return;
        }

        System.out.println("clientul"+c.getNume()+" a fost pus la masa "+idMasa);
        s.ocupaMasa(idMasa);
    }
}
