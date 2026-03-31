package cts.singleton;

public class Service implements IService{
   private String numeService;
   private Amasina masina=null;
   private static Service instance=null;

    private Service(String numeService) {
        this.numeService = numeService;

    }

    public static synchronized Service getInstance(String numeService){
        if(instance==null){
            instance=new Service(numeService);
        }
        return instance;
    }

    @Override
    public void adaugaMasina(Amasina masina) {
        if(this.masina==null){
            System.out.println("masina primita");
            this.masina=masina;
        }else{
            System.out.println("nu se poate prelua masina");
        }
    }



    @Override
    public void iesireMasina() {
        if(masina!=null){
            this.masina=null;
        }
    }
}
