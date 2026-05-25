import java.util.Scanner;
public class HomeTaskQn04{
  public static void main(String[] arg){
    Scanner sc= new Scanner(System.in);
    System.out.print("Please enter the length of array 1: ");
    int N1 = sc.nextInt();
    int [] arr1 = new int [N1];
    System.out.print("Please enter the elements of the arr1: ");
    for(int i=0; i< arr1.length; i++){
      arr1[i] =  sc.nextInt();
    }
    System.out.print("Please enter the length of array 2: ");
    int N2  = sc.nextInt();
    int [] arr2 = new int [N2];
    System.out.print("Please enter the elements of the arr2: ");
    boolean flag= false;
    for(int i=0; i< arr2.length; i++){
      arr2[i] =  sc.nextInt();
    }
    for(int i=0; i< arr2.length; i++){
      flag = false;
      for(int j=0; j<arr1.length; j++){
        if(arr2[i]==arr1[j]){
        flag=true;
        break;
        }
      }
      if(flag==false){
          System.out.print("Array 2 is not a subset of Array 1."); 
          break;
      } 
    }
    if(flag==true){
     System.out.print("Array 2 is a subset of Array 1.");  
    }
  }
}


