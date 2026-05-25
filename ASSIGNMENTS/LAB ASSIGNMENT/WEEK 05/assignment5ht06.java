import java.util.Scanner;
public class assignment5ht06 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter N: ");
int N = sc.nextInt();
for (int i = N; i >= 1; i--) {
for (int space = 1; space <= N - i; space++) {
System.out.print(" ");
}
for (int j = 1; j <= i; j++) {
System.out.print(j);
}
for (int k = i - 1; k >= 1; k--) {
System.out.print(k);
}
System.out.println();
}
}
}