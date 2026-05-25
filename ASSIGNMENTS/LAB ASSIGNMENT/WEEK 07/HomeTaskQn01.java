import java.util.Scanner;
public class HomeTaskQn01{
public static void main(String[] arg){
Scanner sc= new Scanner(System.in);
System.out.print("N = ");
int N = sc.nextInt();
int [] arr1 = new int [N];
for(int i=0; i< arr1.length; i++){
arr1[i] =  sc.nextInt();
}
System.out.println("Original Array:");
for(int i= 0; i< arr1.length; i++){
System.out.print (arr1[i] + " ");
if(arr1[i]>0){
arr1[i] =1;
}
else{
arr1[i]= 0;
}
}
System.out.println();
System.out.println("After Modifying:");
for(int i=0; i<arr1.length; i++){
System.out.print (arr1[i] + " ");
}
}
}


