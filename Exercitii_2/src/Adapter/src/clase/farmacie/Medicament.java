package clase.farmacie;

public class Medicament {
    private String nume;
    public Medicament(String nume){
        this.nume=nume;
    }

    public void cumparaMedicament(){
        System.out.println("medicamentul "+nume+" a fost cumparat");
    }
}
