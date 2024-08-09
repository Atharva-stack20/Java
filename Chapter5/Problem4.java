/*Write a program to print multiplication table of 10 in reverse order*/

package Chapter5;

public class Problem4 {
    public static void main(String[] args) {
        int num = 10;
        for (int i =  10; i >0; i--){
            System.out.println(num*i);
        }
    }
}