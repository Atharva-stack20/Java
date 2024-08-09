package Chapter4;
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int numDay = num % 7;

        switch (numDay){
            case 1 :
                System.out.println("On "+num+", the day is Monday");
                break;
            case 2:
                System.out.println("On "+num+", the day is Tuesday");
                break;
            case 3:
                System.out.println("On "+num+", the day is Wednesday");
                break;
            case 4:
                System.out.println("On "+num+", the day is Thursday");
                break;
            case 5:
                System.out.println("On "+num+", the day is Friday");
                break;
            case  6:
                System.out.println("On "+num+", the day is Saturday");
                break;
            case 7:
                System.out.println("On "+num+", the day is Sunday");
                break;
            default:
                System.out.println("Some error occured");

        }
    }
}
