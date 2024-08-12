package Chapter6;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // 2D array
        int[][] flats = new int[2][3];
        flats[0][0] = 001; //Apartment 1st of Oth floor
        flats[0][1] = 002; //Apartment 2nd of Oth floor
        flats[0][2] = 003; //Apartment 3rd of Oth floor
        flats[1][0] = 101; //Apartment 1st of 1st floor
        flats[1][1] = 102; //Apartment 2nd of 1st floor
        flats[1][2] = 103; //Apartment 3rd of 1st floor

        for (int i = 0; i < flats.length; i++){
            for (int j = 0; j < flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
