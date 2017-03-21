/**
 * Created by zsuzsanna.padar on 2017. 03. 21..
 */
public class Exercise13 {
  public static void main(String[] args) {
    int a = 3;
    a = a + 10;

    System.out.println(a);

    int b = 100;
    b = b - 7;
    System.out.println(b);

    int c = 44;
    c = 2 * c;

    System.out.println(c);

    int d = 125;
    d = d / 5;


    System.out.println(d);


    int e = 8;
    e = e * e * e;


    System.out.println(e);


    int f1 = 123;
    int f2 = 345;
    System.out.println(f1 > f2);

    // tell if f1 is bigger than f2 (print as a boolean)


    int g1 = 350;
    int g2 = 200;
    System.out.println( (2 * g1) > g2);
    // tell if the double of g2 is bigger than g1 (print as a boolean)


    long h = 1357988018575474L;
    System.out.println( (h % 11) == 0);

    // tell if it has 11 as a divisor (print as a boolean)


    int i1 = 10;
    int i2 = 3;
    System.out.println( i1 > (i2 * i2) && i1 < (i2 * i2 * i2));
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)


    int j = 1521;
    System.out.println((j % 3) == 0 || (j % 5)== 0);
    // tell if j is dividable by 3 or 5 (print as a boolean)


    String k = "Apple";
    k = k + k + k + k;
    //fill the k variable with its cotnent 4 times


    System.out.println(k);

  }
}
