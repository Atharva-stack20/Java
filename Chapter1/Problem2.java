/*
Write a program to calculate GPA using marks of three subjects (out of 100)
 */

package Chapter1;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER MARKS OF SUB1 : ");
        int a = sc.nextInt();
        System.out.println("ENTER MARKS OF SUB2 : ");
        int b = sc.nextInt();
        System.out.println("ENTER MARKS OF SUB3 : ");
        int c = sc.nextInt();
        float gpa = (float) (a+b+c) * 100 / 300;
        System.out.println("THE SUM OF THE NUMBERS = "+gpa);
    }
}
