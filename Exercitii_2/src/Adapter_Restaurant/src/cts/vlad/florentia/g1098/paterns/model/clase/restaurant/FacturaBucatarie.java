package cts.vlad.florentia.g1098.paterns.model.clase.restaurant;

public class FacturaBucatarie {
    private String denumireProdus;
    private double pret;

    public FacturaBucatarie(String denumireProdus, double pret) {
        this.denumireProdus = denumireProdus;
        this.pret = pret;
    }

    public void printeazaFactura(){
        System.out.println("factura bucatarie: produsulu "+denumireProdus+" pret "+pret);
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    public double getPret() {
        return pret;
    }


}
