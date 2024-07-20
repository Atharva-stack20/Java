package Chapter1;
import java.util.Scanner;

public class PercentCalculator {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 1st subject : ");
        int a = S.nextInt();
        System.out.println("Enter 2nd subject : ");
        int b = S.nextInt();
        System.out.println("Enter 3rd subject : ");
        int c = S.nextInt();
        System.out.println("Enter 4th subject : ");
        int d = S.nextInt();
        System.out.println("Enter 5th subject : ");
        int e = S.nextInt();
        int TotalMarks = a+b+c+d+e;
        System.out.println("total marks : " + TotalMarks);
        float percent = TotalMarks/5f;
        System.out.println("Percentage : " + percent);

    }
}