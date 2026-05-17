package cts.clase;

public class Sala {
    private boolean masaLibera[]=new boolean[5];

    public Sala() {
        this.masaLibera[1] = true;
        this.masaLibera[2] = true;
    }

    public int getMasaLibera(){
        for(int i=0;i<masaLibera.length;i++){
            if(masaLibera[i]){
                return i;
            }
        }
        return -1;
    }

    public void ocupaMasa(int indexMasa){
        this.masaLibera[indexMasa]=false;
    }
}
