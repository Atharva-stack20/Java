/*
Write a java program to convert a string to lowercase
 */

package Chapter3;
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String name = sc.nextLine();

        // System.out.println(name);
        System.out.print("In lower case - "+name.toLowerCase());
    }
}
