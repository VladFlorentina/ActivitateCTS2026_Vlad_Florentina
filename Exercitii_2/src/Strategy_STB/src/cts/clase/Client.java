package cts.clase;

public class Client {
    private String numeC;
    private ModPlata modPlata;

    public Client(String numeC) {
        this.numeC = numeC;
    }

    public void setModPlata(ModPlata modPlata){
        this.modPlata=modPlata;
    }

    public Client(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public Client() {
        this.modPlata = new PlataCard();
    }
    public void plataBilet(){
        modPlata.plata();
    }
}
