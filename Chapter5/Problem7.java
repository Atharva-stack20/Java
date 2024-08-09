/*
Write a program to print the following pattern using a while loop
****
***
**
*
 */


package Chapter5;

public class Problem7 {
    public static void main(String[] args) {
        int i = 4;
        while (i>0){
            int j = 0;
            while (j<i){
                j++;
                System.out.print("*");
            }
            i--;
            System.out.print("\n");

        }
    }
}
