/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Random rand = new Random();
        int result = rand.nextInt(b - a) + a;
        int result2 = rand.nextInt(b - a) + a;
        int result3 = rand.nextInt(b - a) + a;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println("The minimal generated number was " + Math.min(Math.min(result, result2), result3));
    }
}
