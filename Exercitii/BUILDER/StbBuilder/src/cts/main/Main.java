package cts.main;

import cts.builder.AutobuzLinie;
import cts.builder.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args) {

        AutobuzLinieBuilder builder=new AutobuzLinieBuilder();
        AutobuzLinie a1=builder.setModelAutobuz("model1").setNumeSofer("ion").build();

        AutobuzLinie a2=new AutobuzLinieBuilder().setModelAutobuz("Mercedes Citaro")
                .setNumeSofer("Ionescu Vasile")
                .setOprireCapatLinie(false)
                .setDeschidereUsi(false)
                .setTextEcran("Cursa Speciala")
                .build();

        System.out.println("aUTOBUZUL 1 "+a1.toString());
        System.out.println("aUTOBUZUL 2 "+a2.toString());
    }
}
