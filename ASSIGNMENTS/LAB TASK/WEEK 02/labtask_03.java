//Assignment 2 
import java.util.Scanner;
public class labtask_03{
public static void main (String [] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number: ");
int n = sc.nextInt(); 
if (n%5==0 && n%7==0){
System.out.println("Divisible by Both");
}
else if (n%5==0 && n%7!=0){
System.out.println("Divisible by only 5");
}
else if (n%7==0 && n%5!=0){
System.out.println("Divisible by only 7");
}
else {
System.out.println("No");
}
}
}
