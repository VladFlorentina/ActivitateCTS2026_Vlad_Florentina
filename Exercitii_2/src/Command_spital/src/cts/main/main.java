package cts.main;

import cts.clase.*;

public class main {
    public static void main(String[] args) {
        Operator op=new Operator();
        Command c1=new Tratare(new Medic("medic1"),new Pacient("ion"));
        Command c2=new Internare(new Medic("medic2"),new Pacient("vasile"));
        Command c3=new Internare(new Medic("medic3"),new Pacient("ion"));

        op.adaugaComenzi(c1);
        op.adaugaComenzi(c2);
        op.adaugaComenzi(c3);

        op.executaComanda();
        op.executaComanda();
        op.executaComanda();


    }
}
