/*
1 2 3 4 5 4 3 2 1
*/
import java.util.Scanner;
public class labtask08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern number: ");
        int n = sc.nextInt();
         int result=0;
        for(int i =1;i<=n;i++){
            System.out.print(i+" ");
        }
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
