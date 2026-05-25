//Assignment 3
import java.util.Scanner;
public class Labtask_2{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the how many terms you want to add");
int n = sc.nextInt();
int sum= 0;
double avg =0;
for (int i=1; i<=n; i++){
int number = sc.nextInt();
sum+=number;
avg= sum/n;
}
System.out.println(sum);
System.out.println(avg);
}
}