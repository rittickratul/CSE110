/*
      4
    3 4
  2 3 4
1 2 3 4

i   space(n-i)  j(n-i+1)
1    3                 4
2    2                34
3    1               234
4    0              1234

*/
public class labtask04 {
    public static void main(String[] args) {
       int N = 4;
        for(int i =1;i<=N;i++){
            for(int space =1;space<=N-i;space++){
                System.out.print("  ");
            }
            for(int j=N-i+1;j<=N;j++){
                System.out.print(j+" ");
            
            }
           System.out.println();
        }   
    }
}    