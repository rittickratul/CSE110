import java.util.Scanner;
public class week06labtask02{
  public static void main(String[] args) {
    System.out.println("Enter two strings");
    Scanner sc = new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    String result ="";
    if(str1.length()>str2.length()){
      for(int i =0;i<str2.length();i++){
         if(str1.charAt(i)==str2.charAt(i)){
           result+=str2.charAt(i);
         }
         else{
          System.out.println("There is no common prefix");
          break;
         }

      }
      System.out.println("The common prefix is: "+result);

    }
    else{
      for(int i =0;i<str1.length();i++){
         if(str1.charAt(i)==str2.charAt(i)){
           result+=str1.charAt(i);
         }
         else{
          System.out.println("There is no common prefix");
          break;
           }
         }
         System.out.println("The common prefix is: "+result);

       }
    }
}