//Home task question no 6
import java.util.Scanner;
public class ht_06{
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number value ");
int number = sc.nextInt();
int counter = 0;
int sum = 0;
for (int i=1; i<=number; i++) {
if(number%i==0){
sum=sum+i;
counter++;
}
}
if(counter==2){
System.out.println(number + " is a prime number");
}
else{
System.out.println(number + " is not a prime number");
}
if(sum-number==number){
System.out.println(number + " is a perfect number");
}
else{
System.out.println(number + " is not a perfect number");
} 
}
}
