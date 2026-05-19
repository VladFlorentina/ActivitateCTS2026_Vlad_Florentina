package cts.clase;

public class Usa {
    private String pozitieUsa;

    public Usa(String pozitieUsa) {
        this.pozitieUsa = pozitieUsa;
    }

    public  void deschideUsaFortat(){
        System.out.println("Usa "+this.pozitieUsa+" s a deschis fortat");
    }

    public  void punModLiber(){
        System.out.println("Usa "+this.pozitieUsa+" astepata solicitarea calatorilor");
    }
}
