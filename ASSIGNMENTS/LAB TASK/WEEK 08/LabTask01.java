import java.util.Scanner;
public class LabTask01{
    public static void evenChecker(int n){
        if(n%2==0){
            System.out.println("Even!!");
        }
        else{
            System.out.println("Odd!!");
        }
    }
    public static boolean isEven(int a){
            if(a%2==0){
                return true;
            }
            else{
                return false;
            }
        }
    public static boolean isPos(int b){
        if(b>=0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void sequence(int c){
        boolean result1 =isPos(c);
        boolean result2 = isEven(c);
       if(result1==true&& result2==true){
        for(int i =1;i<=c;i++){
          System.out.print(i+" ");
        }
       }
       else{
        for( int i=c;i<=-1;i++){
            System.out.print(i+" ");
        }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        evenChecker(num);
        boolean result = isEven(num);
        System.out.println(result);
        boolean result2 = isPos(num);
        System.out.println(result2);
         sequence(num);
    }
}