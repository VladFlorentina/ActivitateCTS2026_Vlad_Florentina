package cts.clase;

public class Student {
    private String numeS;
    private  ModSustinereExamen modSustinereExamen;

    public Student() {
        this.modSustinereExamen = new ProbaGrila();
    }

    public Student(String numeS) {
        this.numeS = numeS;
    }

    public Student(ModSustinereExamen modSustinereExamen) {
        this.modSustinereExamen = modSustinereExamen;
    }

    public void setModSustinereExamen(ModSustinereExamen modSustinereExamen){
        this.modSustinereExamen=modSustinereExamen;
    }

    public  void examinare(){
        if(this.modSustinereExamen!=null){
            modSustinereExamen.sustinereExamen();
        }else{
            System.out.println("nu a fost nici un mod de sustinere examen");
        }
    }
}
