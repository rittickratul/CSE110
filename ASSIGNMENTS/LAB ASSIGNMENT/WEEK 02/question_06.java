//Question_06
 import java.util.Scanner;
 public class question_06{
 public static void main (String [] args){
 Scanner sc = new Scanner (System.in);
// Enter three numbers 
 System.out.println("Enter three numbers ");
 int n_1=sc.nextInt();
 int n_2=sc.nextInt();
 int n_3=sc.nextInt();
// Find the answer 
 if (n_1 == n_2 && n_2 == n_3 ){
 System.out.println("All numbers are equal");
 }
 else if (n_1 != n_2 || n_2 != n_3 ){
 System.out.println("All numbers are different");
 }
 else {
 System.out.println("Neither all are equal nor different");
 }
 }
 }