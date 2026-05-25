//Question_04
import java.util.Scanner;
 public class question_04{
 public static void main (String [] args){
 Scanner sc = new Scanner (System.in);
//Enter three sides
 System.out.println("Enter three sides");
 int A = sc.nextInt();
 int B = sc.nextInt();
 int C = sc.nextInt();
//Find the triangle type
 if (A==B && B==C){
 System.out.println("This is a Equaleteral triangle");
 }
 else if (A==B || B==C){
 System.out.println("This is a Isosceles triangle");
 }
 else {
 System.out.println("This is a Scalene triangle");
 }
 }
 }