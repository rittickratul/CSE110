import java.util.Scanner;
public class LabTask03 {
    public static boolean isTriangle(int a,int b,int c){
        if(a<b+c && b<a+c && c<b+a){
            return true;
        }
        else{
            return false;
        }
    }
    public static void triArea(int a,int b,int c){
        boolean res = isTriangle(a,b,c);
        if(res==true){
            double s = (a+b+c)/2.0;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }
        else{
            System.out.println("Can’t form triangle");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side: ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd side: ");
        int y = sc.nextInt();
        System.out.println("Enter 3rd side: ");
        int z = sc.nextInt();
        boolean result=isTriangle(x, y, z);
        System.out.println(result);
        triArea(x, y, z);
    }
}
