import java.util.Scanner;
public class assignment5ht03 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter N: ");
int N = sc.nextInt();
for (int i = 1; i <= N; i++) {
for (int space = 1; space<= N - i; space++) {
System.out.print(" ");
}
if (i==1) {
System.out.print("1");
} 
else if (i==N) {
for (int j = 1; j <=2*N-1; j++) {
System.out.print(j);
}
} 
else {
System.out.print("1");
for (int s = 1; s <=2*i -3; s++) {
System.out.print(" ");
}
System.out.print(2 * i - 1);
}
System.out.println();
}
}
}