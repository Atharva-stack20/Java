/*
Write a program to find whether a year entered by the user is leap year or not
 */
package Chapter4;
import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" Not a leap year");
        }
    }
}
