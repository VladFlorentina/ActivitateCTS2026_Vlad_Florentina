package Clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int numarRoti, String numarInamtriculare) {
        super(numarRoti,numarInamtriculare);
    }

    public void afiseazaDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append("Autobuz- Numar roti: ").append(super.numarRoti);
        sb.append("Autobuz- Numar inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(sb.toString());
    }
}
