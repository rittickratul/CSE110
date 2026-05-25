//Home task question no 8
import java.util.Scanner;
public class ht_08{
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
int number  = sc.nextInt();
int counter1 = 0;
int counter2= 0;
for (int i=1;i<=number; i++) {
System.out.print("Enter number " +i+ ": ");
int val= sc.nextInt();
if(val>=0){
counter1++;
}
else{
counter2++;
}
}  
System.out.println(counter1  +" Non-negetive Numbers");
System.out.println(counter2  +" Negetive Numbers");
}
}
