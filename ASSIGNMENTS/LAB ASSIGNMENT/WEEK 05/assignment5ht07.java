import java.util.Scanner;
public class assignment5ht07 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter N: ");
int N = sc.nextInt();
for (int i = N; i >= 1; i -= 2) {
int spaces = (N-i) / 2;
for (int spa = 0; spa < spaces; spa++) {
System.out.print(" ");
}
for (int j = 1; j <=i; j++) {
System.out.print(j);
}
System.out.println();
}
for (int l = 3; l <=N; l += 2) {
int spaces = (N-l) / 2;
for (int s = 0; s < spaces; s++) {
System.out.print(" ");
}
for (int k = 1; k <=l; k++) {
System.out.print(k);
}
System.out.println();
}
}
}