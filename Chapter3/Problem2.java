/*
Write a java program to replace spaces with underscores
 */

package Chapter3;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println(str.replace(" ", "_"));
    }
}
