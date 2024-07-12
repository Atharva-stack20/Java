/*
Write a java program to convert kilometres to miles
 */

package Chapter1;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km : ");
        int km = sc.nextInt();
        double miles = km*0.621371;
        System.out.println("Miles = "+miles);
    }
}
