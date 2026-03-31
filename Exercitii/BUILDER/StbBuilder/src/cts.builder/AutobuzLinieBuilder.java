package cts.builder;

public class AutobuzLinieBuilder implements AutobuzBuilderAbstract {

    private   String modelAutobuz;
    private String numeSofer;
    private boolean oprireCapatLinie=true;
    private boolean deschidereUsi=true;
    private String textEcran="stb";

    public AutobuzLinieBuilder() {
    }

    public AutobuzLinieBuilder setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
        return this;
    }

    public AutobuzLinieBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return  this;
    }

    public AutobuzLinieBuilder setOprireCapatLinie(boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
        return this;
    }

    public AutobuzLinieBuilder setDeschidereUsi(boolean deschidereUsi) {
        this.deschidereUsi = deschidereUsi;
        return this;
    }

    public AutobuzLinieBuilder setTextEcran(String textEcran) {
        this.textEcran = textEcran;
        return this;
    }


    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(modelAutobuz,numeSofer,oprireCapatLinie,deschidereUsi,textEcran);
    }
}
