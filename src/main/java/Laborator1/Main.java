package Laborator1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class Main {
    static void main() {

        //Problema 1

        Invers cuvant = new Invers ("A inceput scoala.");
        System.out.println(cuvant.reverse());

        System.out.println();


        //Problema 2

       ArrayList<Integer> array = new ArrayList<Integer>();
       java.util.Random random = new Random();
       for (int i=1; i<=10; i++)
       {
           array.add( 5 + random.nextInt(21));
       }

        ArrayList<Integer> array2 = new ArrayList<Integer>();

        System.out.println(array);
        System.out.println();

        Collections.sort(array);

        System.out.println(array);


        for (int j=0; j<array.size(); j++){
            for (int k=10; k<=20; k++) {

                if (array.get(j) == k) {
                    array2.add(array.get(j));
                }
            }
        }

        System.out.println(array2);

    }

    //Problema 3

}
