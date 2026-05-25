//Assignment 3
import java.util.Scanner;
public class Labtask_6{
public static void main(String [] args){
Scanner sc = new Scanner(System.in); 
System.out.print("Enter an integer: ");
int num = sc.nextInt();
int count = 0;
while (num > 0) {
num = num / 10; // remove last digit
count++;
}
System.out.println("Total digits = " + count);
}
}


