/*Write a program to find factorial of a given number using while loops*/

package Chapter5;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factorial = num;
        int i = 1;
        while(i<num){
            factorial = factorial * (num - i);
            i++;
        }
        System.out.print("The factorial of "+num+" is = "+factorial);
    }
}
