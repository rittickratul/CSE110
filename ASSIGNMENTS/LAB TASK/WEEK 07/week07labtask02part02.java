import java.util.Scanner;
import java.util.Arrays;
public  class week07labtask02part02{
  public static void main(String args[]){
   Scanner sc = new Scanner (System.in);
   int [] CSE110={7,-31,344,97,100};
   int j =CSE110.length-1;
   for(int i =0;i<CSE110.length/2;i++){                    //Swapping loop 
     int temp = CSE110[i]; 
     CSE110[i]=CSE110[j]; 
     CSE110[j]=temp;
     j--;
     
   }
  System.out.println(Arrays.toString(CSE110));
  }
}