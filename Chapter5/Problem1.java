/*
Write a program to print the following pattern
****
***
**
*
 */

package Chapter5;

public class Problem1 {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}

/*
Inner loop is for moving to the next line
Outer loop is for printing *
*/