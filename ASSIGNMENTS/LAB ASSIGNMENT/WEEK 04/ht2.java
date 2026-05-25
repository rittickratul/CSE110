//Assignment 4 ht2
import java.util.Scanner;
public class  ht2{
public static void main (String args []){
Scanner sc = new Scanner (System.in);
System.out.println("Enter number of students to check:");
int StudentNumber= sc.nextInt();
for(int i=1;i<=StudentNumber;i++){
System.out.println("Enter student ID of student no: " +i);
int StudentID=sc.nextInt();
int temp = StudentID;
boolean lucky = false ;
if (temp>0){
  while (temp%2==0){
  temp/=2;
  }
  if (temp==1){
  lucky = true;
  }
}
if (lucky){
System.out.println("Lucky ID");
}
else{
System.out.println("Not Lucky");
}
}
}
}