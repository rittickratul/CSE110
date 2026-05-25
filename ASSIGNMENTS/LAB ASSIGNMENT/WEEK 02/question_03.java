//Question_03
 import java.util.Scanner;
 public class question_03{
 public static void main (String [] args){
 Scanner sc = new Scanner (System.in);
//Enter three numbers
 System.out.println("Enter three numbers");
 float n_1=sc.nextFloat();
 float n_2=sc.nextFloat();
 float n_3=sc.nextFloat();
//Find the maximum number  
 if (n_1 >n_2 && n_1>n_3){
 System.out.println("Maximum number is " +" " +n_1);
 }
 else if (n_2 >n_1 && n_2>n_3){
 System.out.println("Maximum number is " +" " +n_2);
 }
 else{
 System.out.println("Maximum number is " +" " +n_3);
 }
//Find the minimum number 
 if (n_1 <n_2 && n_1<n_3){
 System.out.println("Minimum number is " +" " +n_1);
 }
 else if (n_2 <n_1 && n_2<n_3){
 System.out.println("Minimum number is " +" " +n_2);
 }
 else{
 System.out.println("Minimum number is " +" " +n_3);
 }
 }
 }