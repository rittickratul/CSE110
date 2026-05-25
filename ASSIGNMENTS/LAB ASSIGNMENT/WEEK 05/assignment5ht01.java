import java.util.Scanner;
public class assignment5ht01{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter pattern number(N):");
int N= sc.nextInt();
for (int i = 1; i <= N;i++) {
for (int space = 1; space <= N - i; space++) {
System.out.print(" ");
}
for (int j = 1; j <= 2*i-1; j++) {
System.out.print(j);
}
System.out.println();
}
for (int i =N- 1; i >= 1; i--) {
for (int s = 1; s <=N- i; s++) {
System.out.print(" ");
}
for (int j = 1; j <= (2 * i - 1); j++) {
System.out.print(j);
}
System.out.println();
}
}
}