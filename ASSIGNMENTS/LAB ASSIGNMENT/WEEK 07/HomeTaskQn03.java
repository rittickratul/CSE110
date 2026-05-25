import java.util.Scanner;
public class HomeTaskQn03{
  public static void main(String[] arg){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int N = sc.nextInt();
    double [] arr1 = new double [N];
    for(int i=0; i< arr1.length; i++){
      System.out.print("Enter a number: ");
      arr1[i] =  sc.nextDouble();
    }
    double min = Double.POSITIVE_INFINITY;
    double max = Double.NEGATIVE_INFINITY;
    int idxMin = 0;
    int idxMax = 0;
    double sum = 0;
    for(int i= 0; i< arr1.length; i++){
      if(arr1[i] > max){
        max = arr1[i];
        idxMax = i;
      }
      if(arr1[i] < min){
        min = arr1[i];
        idxMin= i;
      }
      sum+= arr1[i];
    }
    System.out.println("Maximum element " +max+ " found at index "+idxMax);
    System.out.println("Minimum element "+min+ " found at index "+idxMin);
    System.out.println("Summation: " +sum);
    System.out.printf("Average: %.2f",sum/N);
  }
}

