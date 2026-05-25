//Assignment 3
import java.util.Scanner;
public class Labtask_4{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the term");
int n = sc.nextInt();
for (int i=1; i<=n; i++){
int number = sc.nextInt();
if (number>=0){
  number *=number;
}
else{
break;
}
System.out.println(number);
}
}
}