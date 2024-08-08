/*
What will be the result of following expression
float a = 7/4 * 9/2
 */
package Chapter2;

public class Problem1 {
    public static void main(String[] args) {
        float x = 7/4 * 9/2; // The output will be 4.0 bcz the numbers are integer not floats
        System.out.println(x);
        float y = 7/4.0f * 9/2.0f;
        System.out.println(y); // The output will be 7.875 bcz the numbers are now floats

    }
}
