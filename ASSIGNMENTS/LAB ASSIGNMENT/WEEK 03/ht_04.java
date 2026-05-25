//Home task question no 4
import java.util.Scanner;
public class ht_04{
public  static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of the number");
int number = sc.nextInt();
int x=0;
while (number>0){
x=number%10; 
if (x==number){
System.out.print(x);
}
else {
System.out.print(x +",");
}
number= number/10;
} 
} 
}
