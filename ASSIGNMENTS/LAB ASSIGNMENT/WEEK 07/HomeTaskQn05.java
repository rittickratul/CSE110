public class HomeTaskQn05{
  public static void main(String[] arg){
   int[] marks = {100, 47, 85, 94, 5, 50};
   String[] names = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};
   int N = marks.length;
   for (int i = 0; i < N; i++) {
     for (int j = i+1; j < N ; j++) {
       if (marks[i] > marks[j]) {
         int tempMark = marks[i];
         marks[i] = marks[j ];
         marks[j ] = tempMark;
         String tempName = names[i];
         names[i] = names[j];
         names[j ] = tempName;
       }
     }
   }
   System.out.println("Sorted Array:");
   for (int i = 0; i < N; i++) {
     System.out.print(marks[i] + " ");
   }
   System.out.println();
   for (int i = 0; i < N; i++) {
     System.out.print(names[i] + " ");
   }
  }
}

