package Laborator2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;



    public Student (String nume, String prenume, String grupa)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }
    public String getGrupa()
    {
        return grupa;
    }

    public void AdaugaNota (int nota){

    }
}
