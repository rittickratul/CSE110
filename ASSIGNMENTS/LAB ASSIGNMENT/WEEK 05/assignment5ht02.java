import java.util.Scanner;
public class assignment5ht02{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.print("Enter pattern number(N): ");
int N = sc.nextInt();
for (int i = 1; i <= N; i++) {
for (int space = 1; space <= N - i; space++) {
System.out.print(" ");
}
if (i == N) {
for (int j = 1; j <= N; j++) {
System.out.print(j);
}
} 
else if (i == 1) {
System.out.print(N);
} 
else {
System.out.print(N - i + 1);
for (int s = 1; s <= i - 2; s++) {
System.out.print(" ");
}
System.out.print(N);
}
System.out.println();
}
}
}