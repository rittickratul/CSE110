import java.util.Scanner;
public class RecursiveMethodht02 {
    public static int power(int base,int exponent){
        if(exponent==0||exponent==1){
            return base;
        }
        else{
            return base*power(base,exponent-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = power(5,3);
        System.out.println(x1);
        int x2 = power(8,4);
        System.out.println(x2);
    }
}
