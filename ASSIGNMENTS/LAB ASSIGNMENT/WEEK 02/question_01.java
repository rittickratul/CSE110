//Qustion_01
 import java.util.Scanner;
 public class question_01{
 public static void main (String [] args){
 Scanner sc = new Scanner (System.in);
//Enter a number 
 System.out.println("Enter a number ");
   int a_number = sc.nextInt();
//Go for conditions    
  if (a_number %5==0 && a_number %7==0 ){
   System.out.println("Invalid : Divided by  Both");
  } 
  else if (a_number %5==0) {
  System.out.println(" Divided by only 5");
  }
   else if (a_number %7==0) {
  System.out.println(" Divided by only 7");
  }
   else {
   System.out.println(" No ");
   }
 
  
  
  }
}



