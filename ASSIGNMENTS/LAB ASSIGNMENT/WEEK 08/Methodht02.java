import java.util.Scanner;
public class Methodht02 {
    public static void showDots(int a){
        for(int i=1;i<=a;i++){
            System.out.print(".");
        }
    }
    public static void show_palindrome(int b){
        for(int i = 1;i<=b;i++){
            System.out.print(i);
        }
        for(int j = b-1;j>=1;j--){
            System.out.print(j);
        }
    }
    public static void showDiamond(int c) {
        for (int i = 1; i <= c; i++) {
            showDots(c - i);
            show_palindrome(i);
            showDots(c - i);
            System.out.println();
        }
        for (int i = c - 1; i >= 1; i--) {
            showDots(c - i);
            show_palindrome(i);
            showDots(c - i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern number; ");
        int num = sc.nextInt();
        showDots(5);
        showDots(3);
        show_palindrome(5);
        show_palindrome(3);
        showDiamond(5);
        showDiamond(3);
        showDiamond(num);
    }
}

