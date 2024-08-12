/*
Create an array of 5 floats and calculate their sum
 */

package Chapter6;

public class Problem1 {
    public static void main(String[] args) {
        float sum = 0.0f;
        float[] num = {5.5f,6.1f,9.3f,8.5f,4.2f};
        for (int i = 0; i<num.length; i++){
            sum = sum + num[i];
        }
        System.out.println("The sum of 5 float numbers: "+sum);
    }
}
