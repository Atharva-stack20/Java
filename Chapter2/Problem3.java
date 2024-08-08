/*
Use comparison operators to find out whether a given number is grater than
the user entered or not
 */

package Chapter2;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        float a = sc.nextFloat();
        System.out.println(a>9.6f);
    }
}
