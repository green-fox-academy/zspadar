import java.util.Scanner;

/**
 * Created by zsuzsanna.padar on ${DATE}.
 */
public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Ez a gyerek olyan\n\"okos\".");
        System.out.println(123);
        System.out.println(true);

        boolean isMarried = true;
        String text = "majom";
        double pi = 3.14;
        byte b = 24;
        short peaches = 1;
        int apples = 123;
        long pears = 1233;
        apples = 23;
        System.out.println(peaches++);
        System.out.println(peaches);

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);
    }
}
