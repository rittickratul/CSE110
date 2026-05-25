/*
12345
1   5     condition: if row==1 or row==R or column==1 or column==C print column number
1   5
12345
*/
import java.util.Scanner;
public class labtask06{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of rows(R): ");
      int R = sc.nextInt();
      System.out.println("Enter column number(C): ");
      int C = sc.nextInt();
      for(int i =1;i<=R;i++){
        for(int j =1;j<=C;j++){
          if(i==1||i==R||j==1||j==C){
            System.out.print(j);
          }
          else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
  }
}