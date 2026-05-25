//Home task question no 5  
import java.util.Scanner;
public class ht_05{
public  static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the N-digit vault code: ");
int code = sc.nextInt();
int number = code;
int counter = 0;
while (number > 0) {
counter++;
number /= 10;
}
int divider = 1;
for (int i = 1; i < counter; i++) {
divider *= 10;
}
while (divider > 0) {
int digit = code / divider;       
System.out.print(digit);          
code = code % divider;    
divider /= 10;                 
if (divider > 0) {
System.out.print(", ");
}
}
}
}