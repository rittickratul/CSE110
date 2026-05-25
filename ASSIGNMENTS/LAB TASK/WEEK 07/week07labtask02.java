import java.util.Arrays;
import java.util.Scanner;
public  class week07labtask02{
  public static void main(String args[]){
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter the length of the array(N): ");
   int N = sc.nextInt();
   int [] arr1 = new int[N];
   int [] newArray = new int[arr1.length+1];
   for(int i =0;i<N;i++){
      System.out.println("Enter a number:");
      arr1[i]=sc.nextInt();
  }
   for (int j =0;j<arr1.length;j++){
     System.out.println(j+" : "+ arr1[j]);
   }
   for(int k =0;k<arr1.length;k++){
   newArray[k]=arr1[k];
   }
   newArray[newArray.length-1] =sc.nextInt();
  System.out.println(Arrays.toString(newArray));
  }
}