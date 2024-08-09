package Chapter5;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
            System.out.println("Hello!!");
            if(i==3){
                System.out.println("Ending the loop!");
                break;
            }
        }
    }
}

//public class BreakStatement {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 5){
//            System.out.println(i);
//            System.out.println("Hello!!");
//            i++;
//            if(i==2){
//                System.out.println("Ending the loop!");
//                break;
//            }
//        }
//    }
//}


//public class BreakStatement {
//    public static void main(String[] args) {
//        int i = 0;
//        do{
//            System.out.println(i);
//            System.out.println("Hello!!");
//            i++;
//            if(i==2){
//                System.out.println("Ending the loop!");
//                break;
//            }
//        }while(i<5);
//    }
//}

