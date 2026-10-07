package Laborator1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class Main {
    static void main() {

        //Problema 1

        Invers cuvant = new Invers("A inceput scoala.");
        System.out.println(cuvant.reverse());

        System.out.println();


        //Problema 2

        ArrayList<Integer> array = new ArrayList<Integer>();
        java.util.Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            array.add(5 + random.nextInt(21));
        }

        ArrayList<Integer> array2 = new ArrayList<Integer>();

        System.out.println(array);
        System.out.println();

        Collections.sort(array);

        System.out.println(array);


        for (int j = 0; j < array.size(); j++) {
            for (int k = 10; k <= 20; k++) {

                if (array.get(j) == k) {
                    array2.add(array.get(j));
                }
            }
        }

        System.out.println(array2);

        int min = 19999;
        int max = 0;

        for (int p = 0; p < array.size(); p++) {
            if (array.get(p) > max) {
                max = array.get(p);
            }
            if (array.get(p) < min) {
                min = array.get(p);
            }
        }
        System.out.println(min + " " + max);


        min = 20000;
        max = 0;
        for (int p = 0; p < array2.size(); p++) {
            if (array2.get(p) > max) {
                max = array2.get(p);
            }
            if (array2.get(p) < min) {
                min = array2.get(p);
            }
        }

        System.out.println();
        System.out.println(min + " " + max);


        //Problema 3

        int n = 4;
        int m = 5;

        String[][] matrice = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrice[1][j] = "*";
                matrice[n][j] = "*";
                matrice[i][1] = "*";
                matrice[i][m] = "*";
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(matrice[i][j] + " ");
                System.out.println();
            }

        }
    }

}