/*Write a program to sum first n even numbers using for loop */

package Chapter5;

public class Problem11 {
    public static void main(String[] args) {
        int EvenNumbers = 5;
        int sum = 0;
        for (int i = 0; i < EvenNumbers; i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of first "+EvenNumbers+" even is: "+sum);
    }
}
