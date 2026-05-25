import java.util.Scanner;
public class HomeTask01{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Message: ");
    String str1= sc.nextLine();
    String str2= "";
    String str3="00";
    boolean a= false;
    for (int i=1; i<str1.length(); i++){
      if((str1.charAt(i-1)>='0'&&str1.charAt(i-1)<='9')&&(str1.charAt(i)>='0'&&str1.charAt(i)<='9')){
        str2=str2+str1.charAt(i-1)+str1.charAt(i);
          if(str2.length()==2 && str2.charAt(0)>=str3.charAt(0) && str2.charAt(1)>=str3.charAt(1)){
            a= true;
            str3=str2;
          }
      }
      else{
      str2="";
      }
    }
    if(a==true){
      System.out.println("2-Digit PIN: "+str3);
    }
    else {
      System.out.println("2-Digit PIN: 0");
    }
  }
}

