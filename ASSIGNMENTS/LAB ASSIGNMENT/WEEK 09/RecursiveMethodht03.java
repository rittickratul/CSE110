import java.util.Scanner;
public class RecursiveMethodht03 {
    public static void print_elements(int[] arr, int index) {
        
        if (index >= arr.length) {
            return;
        }
        else{
            System.out.println(arr[index]);
            print_elements(arr, index + 1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {5,6,2,1,8,7};
        int index1 = 2;
        print_elements(arr1, index1);
        int[] arr2 = {13,12,19,21,31,55};
        int index2 = 0;
        print_elements(arr2, index2);
    }
}
