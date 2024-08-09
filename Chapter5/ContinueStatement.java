/*
continue statement exclude the specified iteration
in this code it will exclude 2
*/

package Chapter5;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            if(i==2){
                System.out.println("Exclude 2");
                continue;
            }
            System.out.println(i);
            System.out.println("Hello");
        }
    }
}


//public class ContinueStatement {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 5){
//            i++;
//            if(i==2){
//                System.out.println("Exclude 2");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Hello!!");
//        }
//    }
//}

//public class ContinueStatement {
//    public static void main(String[] args) {
//        int i = 0;
//        do{
//            i++;
//            if(i==2){
//                System.out.println("Exclude 2");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Hello!!");
//        }while(i<5);
//    }
//}