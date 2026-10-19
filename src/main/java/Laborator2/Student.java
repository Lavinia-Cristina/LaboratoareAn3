package Laborator2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;


    public Student(String nume, String prenume, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getGrupa() {
        return grupa;
    }

    public String getPrenume() {
        return prenume;
    }

    public List<Integer> getNote() {
        return note;
    }

    public void AdaugaNota(int nota) {
        this.note.add(nota);
    }

    public boolean esteIntegralist() {
        for (int nota : note) {
            if (nota < 5) return false;
        }
        return true;
    }


    public int getNumarRestante() {
        int restante = 0;
        for (int nota : note) {
            if (nota < 5)
                restante++;
        }
        return restante;
    }

    public double getMedie() {
        if (note.isEmpty()) return 0;
        double suma = 0;
        for (int nota : note) {
            suma += nota;
        }
        return suma / note.size();
    }

 @Override
 public String toString() {
     return "Nume: " + nume + " " + prenume + " | Grupa: " + grupa + " | Note: " + note;
 }
}
