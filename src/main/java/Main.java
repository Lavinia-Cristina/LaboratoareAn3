import java.util.Random;

void main() {


    List<Integer> x = new ArrayList<>();
    List<Integer> y = new ArrayList<>();
    List<Integer> xPlusY = new ArrayList<>(); //a
    Set<Integer> zSet = new TreeSet<>(); //b
    List<Integer> xMinusY = new ArrayList<>();//c
    int p = 4;
    List<Integer> xPlusYLimitedByP = new ArrayList<>(); //d

    java.util.Random random = new Random();
    for (int i = 1; i <= 5; i++) {
        x.add(random.nextInt(10));
    }
    java.util.Random random2 = new Random();
    for (int i = 1; i <= 7; i++) {
        y.add(random2.nextInt(10));
    }


    System.out.println("Acesta e x: " + x);
    System.out.println();
    System.out.println("Acesta e y: " + y);
    System.out.println();

    System.out.println("ACUM SUNT SORTATE:");

    Collections.sort(x);
    Collections.sort(y);
    System.out.println("Acesta e x: " + x);
    System.out.println("Acesta e y: " + y);

    System.out.println();

    System.out.println("a) xPlusY");

    xPlusY.addAll(x);
    xPlusY.addAll(y);


    System.out.println(xPlusY);
    System.out.println();

    System.out.println("xPlusY Sortat:");
    Collections.sort(xPlusY);
    System.out.println(xPlusY);
    System.out.println();

    System.out.println("b) ZSet");

    zSet.addAll(x);
    zSet.addAll(y);
    System.out.println(zSet);
    System.out.println();


    System.out.println("c) XMinusY");
    xMinusY.addAll(x);
    xMinusY.addAll(y);
    xMinusY.removeAll(y);

    System.out.println(xMinusY);
    System.out.println();


    System.out.println("d) xPlusYLimitedByP");


/*    for (int i = xPlusY.size()-1; i >= 0; i--) {
        Integer v = xPlusY.get(i);
        if (v < p) {
            xPlusYLimitedByP.add(v);
        }
    }*/

    xPlusYLimitedByP.addAll(xPlusY);
    Iterator<Integer> i = xPlusYLimitedByP.iterator();
    while (i.hasNext()) {
        if (i.next() >= p) {
            i.remove();
        }
    }

    System.out.println(xPlusYLimitedByP);

}