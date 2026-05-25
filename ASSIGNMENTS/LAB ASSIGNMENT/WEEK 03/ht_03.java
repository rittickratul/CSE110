//Home task question no 3
import java.util.Scanner;
public class ht_03{
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter enrgy(E):");
int E = sc.nextInt();
System.out.println("Enter the number of rivers (N):");
int N = sc.nextInt();
boolean tired =false;
for (int i=1; i<=N; i++){
System.out.println("Enter distance (D): "+i);
int D =sc.nextInt();
if (D<=5){
E-=2;
}
if (D>5){
E-=D/2;
}
if (E<0){
System.out.println("Charmander is tired at River: " +i);
tired=true;
break;
}
}
if(!tired){
System.out.println("All Done");
System.out.println(E +" Energy Left ");                  }
}
}

