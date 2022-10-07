package Day3hw;

public class SecondLargest {
    public static void main(String aegs[]){
        int arr[] = {50,40,35,20,10};
        int tep,size;
        size = arr.length;
        for (int i = 0; i < size; i++){
            for (int j = i + 1;j < size; j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[i];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is "+ arr[size - 2]);
    }
}
