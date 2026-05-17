package cts.vlad.florentia.g1098.paterns.model.clase.bar;

public class SoftBar {
    private String numeBautura;

    public SoftBar(String numeBautura) {
        this.numeBautura = numeBautura;
    }

    public void genereazaNotaBar(){
        System.out.println("noul soft de bar a emis nota pt bautura "+numeBautura);
    }

    public String getNumeBautura() {
        return numeBautura;
    }
}
