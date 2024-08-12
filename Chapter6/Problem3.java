/*
calculate the average marks from an array containing marks of all students in physics using for-each loop
 */

package Chapter6;

public class Problem3 {
    public static void main(String[] args) {
        float[] marks = {86.5f, 95.3f, 89.2f, 75.6f, 88.4f};
        float sum = 0.0f;
        float avg = 0.0f;

        for (float element:marks){
            sum = sum + element;
        }
         avg = sum/marks.length;
         System.out.println("The average marks of student = "+avg);
    }
}
