package org.example;

public class Invers {
    String cuvant;

    public Invers() {

    }

    public Invers (String a) {
        this.cuvant=a;
    }

   String reverse(){
        StringBuilder sb = new StringBuilder();
        sb.append(cuvant);
        return sb.reverse().toString();
   }


}
