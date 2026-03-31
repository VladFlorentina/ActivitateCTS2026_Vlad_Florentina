package cts.builder;

public class AutobuzLinie {

    protected final  String modelAutobuz;
    protected final String numeSofer;
    protected final boolean oprireCapatLinie;
    protected final boolean deschidereUsi;
    protected final String textEcran;


    protected AutobuzLinie(String modelAutobuz, String numeSofer, boolean oprireCapatLinie, boolean deschidereUsi, String textEcran) {
        this.modelAutobuz = modelAutobuz;
        this.numeSofer = numeSofer;
        this.oprireCapatLinie = oprireCapatLinie;
        this.deschidereUsi = deschidereUsi;
        this.textEcran = textEcran;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", oprireCapatLinie=").append(oprireCapatLinie);
        sb.append(", deschidereUsi=").append(deschidereUsi);
        sb.append(", textEcran='").append(textEcran).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
