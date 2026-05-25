//Home task question no 2
import java.util.Scanner;
public class ht_02{
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Please Enter number of Herbs : ");
int herb = sc.nextInt();
System.out.print("Please Enter number of Crystals : ");
int crystal = sc.nextInt();
int i = 1;
while (herb >=3 && crystal >= 2) {
herb -= 3;
crystal -= 2;
System.out.println("Potion-" + i + " created");
System.out.println("Remaining Herbs: " + herb + ", Remaining Crystals: " + crystal);
i++;
}
i--;
System.out.println("Potions Created: " + i);
if (i % 2 == 0) {
System.out.println("Stable Elixir");
} 
else {
System.out.println("Volatile Brew");
}
}
}