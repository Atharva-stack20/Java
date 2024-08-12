package Chapter6;

public class PracticeOnArray {
    public static void main(String[] args) {
        // Array can be in any data type like int, float, string
        int[] primeNumbers = {1, 3, 5, 7, 11};
        System.out.println("1st prime no: "+primeNumbers[0]);

        float[] marks = {98.5f, 80.0f, 94.5f, 70.5f};
        System.out.println("Marks of 3rd student: "+marks[2]);

        String[] name = {"Atharva", "Rohan", "Jonas", "Abhishek"};
        System.out.println("Name of 3rd student: "+name[2]);

        // Length of an Array
        System.out.println("Length of name: "+name.length);

        System.out.println("------Printing using for loop------");
        /* Displaying array
        this loop provides element in the array as well as index value */
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }

        System.out.println("-------Printing using for-each loop--------");
        /* Displaying using for-each loop
        this loop only provides element in the array */
        for (String element : name){
            System.out.println(element);
        }
    }
}
