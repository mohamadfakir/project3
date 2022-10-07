package Day3hw;

import java.io.PrintStream;

public class Arrayproblem {
    public static PrintStream out;

    public static void main(String[] args) {
        //initilizing an array
        int[] arrary = {-5, 2, -1, 1, -2, -3, 4, 5, 2, -3, -8, -9, 6, 8, 7};
        System.out.println("Elements of an array:");
        //checking for all elements present in array and print.
        for (int s : arrary) {
            System.out.print(s + " ");
        }
    }
}
