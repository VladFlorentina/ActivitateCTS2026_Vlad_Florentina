package Clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Troleibuz- Numar roti: ").append(super.numarRoti);
        sb.append("Troleibuz- Numar inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(sb.toString());
    }
}
