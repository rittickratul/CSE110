import java.util.Scanner;
public class HomeTask04{
  public static void main(String[]arg){
    Scanner sc= new Scanner(System.in);
    System.out.println("Fan Message: ");
    String str1_low = sc.nextLine();
    String str2 = "";
    int M=0;
    int C=0;
    int result = 0;
    for(int i=1; i< str1_low.length(); i++){
      char c = str1_low. charAt(i);
      if(c>='A'&&c<='Z'){
      int ascii = (int) c;
      ascii+=32;
      c= (char) ascii; 
      }
      if(c==' ' || c== '.' || c== '!'){
        str2= "";
        continue;
      }
      str2+=c;
      if(str2.equals("madrid")){
        M++;
      }
      else if (str2.equals("city")){
        C++;
      }
      if(str2.equals("close")){ result=1;}
      else if (str2.equals("destroy")){ result =2;}
    }
    if(M>C){
      System.out.println("Madrid Supporter");
    }
    else if(C>M){
      System.out.println("City Supporter");
    }
    else{
      System.out.println("Neutral");
    }
    if(result==1){
    System.out.println("Fan expect a close match");
    }
    else if(result==2){
    System.out.println("Fan expects a dominating victory!");
    }
    else{
    System.out.println("Hard to read the fan sentiment");
    }
  }
}
