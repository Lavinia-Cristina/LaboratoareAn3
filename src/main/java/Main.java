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

    System.out.println(x);
    System.out.println();
    System.out.println(y);
    System.out.println();

    System.out.println("ACUM SUNT SORTATE:");

    Collections.sort(x);
    Collections.sort(y);
    System.out.println(x);
    System.out.println(y);

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





}