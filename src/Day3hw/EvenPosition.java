package Day3hw;

public class EvenPosition {
    public static void main(String[] args) {
        //initilizing an array
        int[] arrary = {2, 5, 6, 8, 4, 2, 3, 1, 5, 9, 3, 4};
        System.out.println("Elements of given array present on even position: ");
        for (int i = 1; i < arrary.length; i = i + 2) {
            //here array[1]=2,array[2]=5 like wise
            //so loop shows only even positions i.e. array[2]=5,array[4]=8 like wise
            System.out.println(arrary[i]);
        }
    }
}
