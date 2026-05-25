import java.util.Scanner;
public class HomeTask03{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Names of the spells: ");
    String str2="";
    String str3="";
    int level=0;
    while (true){
      String str1= sc.nextLine();
      if (str1.equals("stop")){
        break;
      }
      for(int i=0; i<str1.length(); i++){
        char c = str1.charAt(i);
        if (c>='a' && c<='z'){
          c-=32;
        }
          if(c>='A' && c<= 'Z'){
            str2+=c;
          }
      }
      if(str2.length()>str3.length()){
      str3=str2;
      } 
      str2="";
    }
    for(int i=0; i<str3.length(); i++){
      int a = (int) str3.charAt(i);
      level +=a;
    }
    System.out.println("Largest Spell : "+str3);
    System.out.println("Power Level : "+level);
  }
}