//Assignment 4 ht3
import java.util.Scanner;
public class  ht3{
public static void main (String args []){
Scanner sc = new Scanner (System.in);
System.out.println("Enter number of days:");
int D = sc.nextInt();
for (int i=1; i<=D; i++){
int sum=0; 
int product=0;
double totalprice =0;
System.out.println("Enter the number of sales in day "+ i +": ");
int n = sc.nextInt();
for (int j =1;j<=n;j++ ){
  System.out.println("Enter the price of products: ");
product = sc.nextInt();
sum+=product;
if(sum>=100 && sum<200 ){
  totalprice =sum+sum*.02;
}
else if (sum>=200 && sum<500){
totalprice =sum+sum*.05;
}
else{
totalprice =sum+sum*.1;
}
}
System.out.println("Day" + i +" Total sales with tax is " + totalprice);
}
}  
}