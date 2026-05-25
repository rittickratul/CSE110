import java.util.Scanner;
public class Methodht01{
   public static boolean isPrime(int a){
    int count = 0;
    if(a<=1){
        return false;
    }
    for(int i =1;i<=a;i++){
        if(a%i==0){
            count++;
        }
    }
    if(count<=2){
       return true;
        }
    else{
        return false;
        }
   } 
   public static boolean isPerfect(int b){
    int sum =0;
    for(int i =1;i<=b;i++){
        if(b%i==0){
            sum+=i;
        }
    }
    if(sum-b==b){
        return true;
    }
    else{
        return false;
    }

   }
   public static void special_sum(int c) {
        int result = 0;
        for (int i = 1; i <= c; i++) {
            if (isPrime(i) || isPerfect(i)) {
                result+= i;
            }
        }
        System.out.println(result); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean check1 = isPrime(num);
        System.out.println(check1);
        boolean check2 = isPerfect(num);
        System.out.println(check2);
        special_sum(num);
    }
}
