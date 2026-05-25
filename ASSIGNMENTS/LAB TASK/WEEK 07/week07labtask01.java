import java.util.Arrays;
import java.util.Scanner;
public  class week07labtask01{
  public static void main(String args[]){
   Scanner sc = new Scanner (System.in);
  System.out.println("Enter the length of the array(N): ");
  int N = sc.nextInt();
  int [] arr1 = new int[N];
    for(int i =0;i<N;i++){
      System.out.println("Enter a number:");
      arr1[i]=sc.nextInt();
  }
    for(int j =0;j<=arr1.length-1;j++){
      System.out.println(j +":"+arr1[j]);
    
    }
    System.out.println("After resizing the array:\n"+Arrays.toString(arr1));
}
}