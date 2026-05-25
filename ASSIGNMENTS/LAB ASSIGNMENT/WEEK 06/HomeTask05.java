import java.util.Scanner;
public class HomeTask05{
  public static void main(String[]arg){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str1= sc.nextLine();
    int counter = 0;
    for(int i= (str1.length()-1); i>=0; i--){
      char c = str1.charAt(i);
      if(c== ' '){
        break;
      }
      else{
        counter++;
      }
    }
    System.out.print(counter);
  }
}
