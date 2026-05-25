import java.util.Scanner;
public class LabTASK2 {
    public static void main(String[] args) {
       System.out.println("Enter number of Students: ");
       Scanner sc = new Scanner(System.in);
       int students=sc.nextInt(); 
       System.out.println("Enter number of missions: ");
       float missions=sc.nextInt(); 
      float maxval=0;
       int topstudent=0;
       for(int i =1;i<=students;i++){
        System.out.println("Scores of Student "+i);
        int sum=0;
       float avg=0;
        for(int j=1;j<=missions;j++){
            System.out.println("Enter points of mission "+j+" for student "+i);
            int points=sc.nextInt();
            sum+=points; 
        }
        avg=sum/missions;
        System.out.println("Average point for student "+i+" is "+avg);
        if(avg>maxval){
        maxval=avg;
        topstudent=i;
       }
       }
     System.out.println(topstudent+" receives the badge of honour!");
    }
    
}
