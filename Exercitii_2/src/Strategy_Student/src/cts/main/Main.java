package cts.main;

import cts.clase.ProbaGrila;
import cts.clase.ProbaOrala;
import cts.clase.ProbaScrisa;
import cts.clase.Student;

public class Main {

    public static void main(String[] args) {
        Student student=new Student("Ana");

        System.out.println("--- Testare Proba Scrisa ---");
        student.setModSustinereExamen(new ProbaScrisa());
        student.examinare();

        System.out.println("\n--- Schimbare dinamica: Proba Orala ---");
        // Schimbam comportamentul in timpul rularii fara a crea alt student
        student.setModSustinereExamen(new ProbaOrala());
        student.examinare();

        System.out.println("\n--- Schimbare dinamica: Proba Grila ---");
        // Schimbam din nou comportamentul
        student.setModSustinereExamen(new ProbaGrila());
        student.examinare();
    }
}
