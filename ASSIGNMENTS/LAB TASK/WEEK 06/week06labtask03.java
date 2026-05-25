import java.util.Scanner;
public class week06labtask03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter the String
        String str ="d3mgxHopperwasHere7bq";
        System.out.println("Enter start index: ");
        int startindex=sc.nextInt();
        System.out.println("Enter  end index: ");
        int endindex=sc.nextInt();
        String result ="";
        for(int i =startindex;i<endindex;i++){
            result+=str.charAt(i);
        }
        System.out.print(result);
        // String modified =str.substring(5,18);
        // System.out.println(modified);
        
    }
}
