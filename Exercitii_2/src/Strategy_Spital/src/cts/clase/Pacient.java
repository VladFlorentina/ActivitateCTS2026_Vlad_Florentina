package cts.clase;

public class Pacient {
    private  String numeP;
    private  double sumaPlata;
    private ModPlata modPlata;

    public Pacient() {
        this.modPlata=new PlataCard();
    }

    public Pacient(String numeP, double sumaPlata) {
        this.numeP = numeP;
        this.sumaPlata = sumaPlata;
    }

    public Pacient(ModPlata modPlata) {
        this.modPlata=modPlata;
    }

    public void setModPlata(ModPlata modPlata){
        this.modPlata=modPlata;
    }

    public void setSumaPlata(double sumaPlata){
        this.sumaPlata=sumaPlata;
    }

    public  void platesteSpitalizarea(){
        if(this.modPlata!=null){
            if(numeP!=null){
                System.out.println("pacientul "+this.numeP+" ");
            }else {
                System.out.println("Pacientul anonim ");
            }
            this.modPlata.plateste(this.sumaPlata);
        }else{
            System.out.println("Pacientul "+this.numeP+" nu poate achita deoarece nu a fost selectata o metoda de plata");
        }
    }


}
