//Assignment 3
import java.util.Scanner;
public class Labtask_5{
public static void main(String [] args){
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the term");
int n =sc.nextInt();
int y=0;
for (int i =1; i<=n; i++){
  int in= i*i ;
  if (i%2==0){
  y-=in;
  }
  else {
  y+=in;
  }
}
System.out.println(y);
}
}