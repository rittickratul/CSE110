//Assignment 2 
import java.util.Scanner;
public class labtask_02{
public static void main (String [] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter your number:");
int n = sc.nextInt();
if (n>=90 && n<=100){
System.out.println("Grade : A");
}
else if(n<=89 && n>=85){
System.out.println("Grade : A-");
}
else if(n<=84 && n>=70){
System.out.println("Grade : B");
}
else if(n<=69 && n>=57){
System.out.println("Grade : C");
}
else if(n<=56 && n>=50){
System.out.println("Grade : D");
}
else {
  System.out.println("Grade : F");
}
}
}
