//Assignment 4 ht4
import java.util.Scanner;
public class  ht4{
public static void main (String args []){
Scanner sc = new Scanner (System.in);
System.out.println("Enter Numbers of members: ");
int member = sc.nextInt();
double sum = 0;
double avg = 0;
int calorie=0;
for (int i =1; i<=member ; i++){
System.out.println("Enter the number of exercise for member " +i+ " :");
int n = sc.nextInt(); 
for (int j =1 ; j<=3; j++){
System.out.println("Enter the calorie ammount for exercise " +j+ " :");
calorie = sc.nextInt();
if (n>3){
System.out.println("Can't do more than 3 exercise");
continue;
}
if (calorie > 350  ) {
calorie += calorie * 50 / 100;
}
else if (calorie > 200 && calorie <350) {
calorie += calorie * 10 / 100;
}
else {
calorie -= calorie * 10 / 100;
}
sum+=calorie ;
if (avg>400){
sum+=50*n;
}
}
avg = sum/n;
System.out.printf("Average calories for Member-%d: %.3f\n", i, avg);
}
}
}