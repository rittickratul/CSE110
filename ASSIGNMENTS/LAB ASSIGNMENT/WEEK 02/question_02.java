//Question_02
 import java.util.Scanner;
 public class question_02{
 public static void main (String [] args){
 Scanner sc = new Scanner (System.in);
  System.out.println("Enter electricity consumed (kWh): ");
int electricity_consumed = sc.nextInt();
System.out.println("Enter your age: ");
int age = sc.nextInt();
double Final_bill = electricity_consumed*15;
if (age<18){
Final_bill = Final_bill-0.2*Final_bill;
}
else if (age>=18 && age<=60){
Final_bill = Final_bill;
}
else{
Final_bill = Final_bill-Final_bill*0.1; 
}
if (electricity_consumed <=100){
System.out.println("Final Bill: " +Final_bill );
}
else{
Final_bill = Final_bill+0.05*Final_bill;
System.out.println("Final Bill: " +Final_bill );
}
 }
 }
 
 