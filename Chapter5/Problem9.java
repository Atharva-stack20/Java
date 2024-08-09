/*Write a program to calculate the sum of the numbers occuring in the multiplication table of 8*/

package Chapter5;

public class Problem9 {
    public static void main(String[] args) {
        int num = 8;
        int multiplication = 1;
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            multiplication = num * i;
            sum = sum + multiplication;
        }
        System.out.println(sum);
    }
}
