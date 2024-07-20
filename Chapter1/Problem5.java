/*
Write a java program to detect whether a given number entered by user is integer or not
*/

package Chapter1;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        System.out.println(sc.hasNextInt());
    }
}