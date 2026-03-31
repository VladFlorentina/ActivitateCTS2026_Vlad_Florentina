package cts.singleton;

public class Abonament implements AbstractMembership {
    private  String nume;
    private String tipAbonament;
    private static Abonament instance=null;

    private Abonament(String nume, String tipAbonament) {
        this.nume = nume;
        this.tipAbonament = tipAbonament;
    }

    public static synchronized Abonament getInstance(String nume,String tipAbonament){
        if(instance==null){
            instance=new Abonament(nume,tipAbonament);
        }
        return instance;
    }

    @Override
    public void detalii() {
        System.out.println("abonamentul este pe numele "+nume+" si este de tip  "+tipAbonament);
    }
}
