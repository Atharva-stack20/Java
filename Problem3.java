/*
Write a java program which asks the user to enter his/her name and
greets them with "Hello" name entered by user "how are you"
 */

package Chapter1;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+", how are you?");
    }
}
