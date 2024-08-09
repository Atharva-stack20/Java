/*
Write a program to find out whether a student is pass or fail.
if it requires total 40% and at least 33% in each subject to pass;
Assume 3 subject and take marks as input from the user
 */

package Chapter4;
import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1 : ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2 : ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3 : ");
        int sub3 = sc.nextInt();

        float totalMarks = (float) (sub1+sub2+sub3) /3f;
        if(sub1>33 && sub2>33 && sub3>33 && totalMarks>40){
            System.out.println("Pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
