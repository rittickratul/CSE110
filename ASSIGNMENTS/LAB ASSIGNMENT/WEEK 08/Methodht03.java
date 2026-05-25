import java.util.Scanner;
public class Methodht03 {
    public static double calcTax(int a ,double b){
        if(a<18){
            return 0;
        }
        else{
            if(b<10000){
                return 0;
            }
            else if(b>=10000 && b<=20000){
                return b*0.07;
            }
            else{
               return b*0.14;
            }
        }
    }
    public static void calcYearlyTax() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        double totalYearlyTax = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.print("Enter income for month " + i + " : ");
            double monthlySalary = sc.nextDouble();
            double monthlyTax = calcTax(age, monthlySalary);
            System.out.println("Month" + i + " tax: " + monthlyTax);
            totalYearlyTax += monthlyTax;
        }
        System.out.println("Total Yearly Tax: " + totalYearlyTax);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t1 = calcTax(16,20000);
        System.out.println(t1);
        double t2 = calcTax(20,18000);
        System.out.println(t2);
        calcYearlyTax();
    }
}
