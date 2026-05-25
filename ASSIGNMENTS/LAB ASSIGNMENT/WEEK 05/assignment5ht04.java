import java.util.Scanner;
public class assignment5ht04 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter N: ");
int N = sc.nextInt();
for (int i = 1; i<=N; i++) {
for (int s = 1; s<=N-i; s++) {
System.out.print(" ");
}
System.out.print("1");
if (i > 1) {
for (int space = 1; space<=(2*i)- 3; space++) {
System.out.print(" ");
}
System.out.print((2*i)- 1);
}
System.out.println();
}
for (int j =N - 1; j>= 1; j--) {
for (int k = 1; k<= N- j; k++) {
System.out.print(" ");
}
System.out.print("1");
if (j > 1) {
for (int s = 1; s<=(2*j)-3; s++) {
System.out.print(" ");
}
System.out.print((2*j) - 1);
}
System.out.println();
} 
}
}