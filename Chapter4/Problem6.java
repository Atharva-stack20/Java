/*
Write a program to find out the type of website from the url:

        .com -> Commercial Website
        .org -> Organisation Website
        .in  -> Indian Website
 */

package Chapter4;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL : ");
        String url = sc.nextLine();

        if(url.endsWith(".com")){
            System.out.println("It is a commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("It is an organisation Website");
        } else if (url.endsWith(".in")) {
            System.out.println("it is an Indian website");
        }
    }
}
