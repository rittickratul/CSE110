//Assignment 2 
import java.util.Scanner;
public class labtask_04{
public static void main (String [] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the year");
int y = sc.nextInt();
if (y%4==0 && (y%400==0 || y%100!=0)){
System.out.println("The year is a leap year");
}
else {
System.out.println("The year is not a leap year");
}
}
}