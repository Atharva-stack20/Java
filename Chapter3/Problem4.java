/*
Write a java program to detect double and triple spaces in a string
 */

package Chapter3;

public class Problem4 {
    public static void main(String[] args) {
        String str = "Hello there,   how  you doing?   ";
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf("   "));
        System.out.println(str.indexOf("     ")); // It will give o/p as -1 as no 4 spaces are there in the string
    }
}
