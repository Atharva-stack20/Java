/*Write a program to print multiplication table of a given number n*/

package Chapter5;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n",num, i, num*i);
        }
    }
}
