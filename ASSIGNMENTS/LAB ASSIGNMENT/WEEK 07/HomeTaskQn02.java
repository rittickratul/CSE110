import java.util.Scanner;
public class HomeTaskQn02{
  public static void main(String[] arg){
    Scanner sc= new Scanner(System.in);
    System.out.print(" N= ");
    int N = sc.nextInt();
    int [] arr1 = new int [N];
    for(int i=0; i< arr1.length; i++){
      System.out.print("Enter a number: ");
      arr1[i] =  sc.nextInt();
    }
    int a = sc.nextInt();
    boolean flag = true;
    for(int i= 0; i< arr1.length; i++){
      if(arr1[i] == a){
      System.out.print (arr1[i] + " is at index "+ i);
      flag = false;
      break;
      }
    }
    if(flag){
    System.out.println("Element not found");
    }
  }
}

