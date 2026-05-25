//Assignment 4 ht1
import java.util.Scanner;
public class  ht1{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start & End Number: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
   for(int i =start;i<=end;i++){
        int temp=i;
        int digits=0;
        int sum=0;
        while(temp>0){
            digits=temp%10;
            sum+=Math.pow(digits, 3);
            temp/=10;
        }
        if(i==sum){
            System.out.println("The special vanity number is "+sum);
        }
    }
}
}