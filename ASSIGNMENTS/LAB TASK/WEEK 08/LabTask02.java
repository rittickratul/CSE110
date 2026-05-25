import java.util.Scanner;
public class LabTask02{
    public static double circleArea(int a){
        return Math.PI*a*a;
    }
    public static double sphereVolume(double  b){
        return Math.PI*b*b*b*(4/3.0);
    }
    public static void findSpace(String s ,int c){
        if(s.equals("circle")){
         System.out.println(circleArea(c/2));  
        }
        else if(s.equals("sphere")){
         System.out.println(sphereVolume(c/2));  
        }
        else{
            System.out.println("Wrong Parameter");
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter  the radius of the cirlcle: ");
      int r = sc.nextInt();
      double area = circleArea(r);
      System.out.println(area);
      System.out.println("Enter  the radius of the sphere: ");
      double R = sc.nextDouble();
      double volume = sphereVolume(R);
      System.out.println(volume);
      findSpace("circle", 10);
    }
}