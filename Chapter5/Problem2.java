/*Write a program to sum first n even numbers using while loop */

package Chapter5;

public class Problem2 {
    public static void main(String[] args) {
        int EvenNumbers = 3;
        int sum = 0;
        int i = 0;
        while (i<EvenNumbers){
            sum = sum + (2*i);
            i++;
        }
        System.out.println("Sum of first "+EvenNumbers+" even is: "+sum);
    }
}
