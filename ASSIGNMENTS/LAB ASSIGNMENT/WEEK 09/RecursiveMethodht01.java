import java.util.Scanner;
public class RecursiveMethodht01{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which factorial you want: ");
        int n = sc.nextInt();
        int x = factorial(n);
        System.out.println(x);
    }
}