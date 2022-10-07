package Day3hw;

public class OddPosition {
    public static void main(String[] args) {
        //initilizing an array
        int[] arrary = {5, 6, 8, 9, 4, 1, 2, 6, 3, 4, 1};
        System.out.println("Elements of given array present on odd position: ");
        for (int i = 0; i < arrary.length; i = i + 2) {
            //here array[1]=5,array[2]=6,array[3]=8
            //so loop shows only odd positions i.e. array[1]=5,array[3]=8 like wise
            System.out.println(arrary[i]);
        }
    }
}
