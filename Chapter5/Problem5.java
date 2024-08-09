/*Write a program to find factorial of a given number using for loops*/

package Chapter5;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factorial = num;
        for(int i = 1; i < num; i++){
            factorial = factorial * (num - i);
        }
        System.out.print("The factorial of "+num+"is = "+factorial);
    }
}




