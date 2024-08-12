package Chapter6;

public class WaysToDeclareArray {
    public static void main(String[] args) {

//        Method - 1.  Declaration and then memory allocation
//        int[] marks;          //Declaration
//        marks = new int[5];   //Memory allocation
//        marks[0] = 89;
//        marks[1] = 66;
//        marks[2] = 85;
//        marks[3] = 90;
//        marks[4] = 70;
//
//        System.out.print("Marks of 3rd student: "+marks[3]);

//        Method - 2. Declaration and memory allocation
//        int[] marks = new int[5];
//        marks[0] = 89;
//        marks[1] = 66;
//        marks[2] = 85;
//        marks[3] = 90;
//        marks[4] = 70;
//
//        System.out.print("Marks of 3rd student: "+marks[3]);

//        Method - 3. Declaration and memory allocation and initialization in single line
        int[] marks = {89,66,85,90,70};
        System.out.print("Marks of 3rd student: "+marks[3]);
    }
}
