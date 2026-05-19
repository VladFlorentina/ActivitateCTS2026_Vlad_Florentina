package cts.clase;

public class PlataCash implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata in valoare de " + suma + " RON a fost efectuata cu succes folosind CASH.");
    }
}
