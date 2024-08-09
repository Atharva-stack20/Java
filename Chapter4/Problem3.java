/*
Calculate income tax paid by an employee to the government as per the
slabs mentioned below:

        Income slab     Tax
        2.5L - 5.0L     5%
        5.0L - 10.0L    20%
        Above 10.0L     30%

Note that there is no tax below 2.5L. Take input amount as an input
from the user.
 */

package Chapter4;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        int salary = sc.nextInt();
        float Tax = 0;

        if (salary < 250000){
            System.out.println("No need to pay Tax");
        }
        else if (salary<500000 && salary>250000) {
            Tax = Tax + (salary - 250000)*0.05f;
            System.out.println("You need to pay "+Tax+" as tax to the gov.");
        }
        else if (salary<1000000 && salary>500000) {
            Tax = Tax + (salary - 250000)*0.2f;
            System.out.println("You need to pay "+Tax+" as tax to the gov.");
        }
        else if (salary>=1000000) {
            Tax = Tax + (salary - 250000) * 0.3f;
            System.out.println("You need to pay " + Tax + " as tax to the gov.");
        }
    }
}
