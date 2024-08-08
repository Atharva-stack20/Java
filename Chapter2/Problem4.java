/*
Write following expression in java program
   v^2 - u^2
   ---------
     2*a*s
 */

package Chapter2;

public class Problem4 {
    public static void main(String[] args) {
        float v = 5.0f;
        float u = 6.0f;
        float a = 8.0f;
        float s = 3.0f;

        float expression = (v*v - u*u) / (2*a*s);
        System.out.println(expression);
    }
}
