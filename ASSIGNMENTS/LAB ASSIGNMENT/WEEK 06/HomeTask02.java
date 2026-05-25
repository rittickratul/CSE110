import java.util.Scanner;
public class HomeTask02{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String str1= sc.nextLine();
    String str2= str1;
    for(int i=0; i<str1.length(); i++){
      char c =str1.charAt(i); 
      if(c=='A' || c=='E' || c== 'I' || c=='O' || c=='U' || c=='a' || c=='e' || c== 'i' || c=='o' || c=='u'){
        for(int j=str2.length()-(i+1); j>=0; j--){
          char d = str2.charAt(j);
          if(d=='A' || d=='E' || d== 'I' || d=='O' || d=='U' || d=='a' || d=='e' || d== 'i' || d=='o' || d=='u'){
          c=d;
          break;
          }
        }
      }
      System.out.print(c);
    }
  }
}