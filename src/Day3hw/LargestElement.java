package Day3hw;

public class LargestElement {
    public static void main(String[] args) {
        //initilizing an array
        int[] array = {5, 12, -10, 11, 22, -43, 47, 85, 92, -32, -85,7, 67, 89, 71};
        int large = array[0];
        for (int i = 0; i < array.length; i++) {
            //Comparing both arrays to get largest array
            if (array[i] > large)
                large = array[i];
        }
        System.out.println("Largest element of array is= " + large);
    }
}
