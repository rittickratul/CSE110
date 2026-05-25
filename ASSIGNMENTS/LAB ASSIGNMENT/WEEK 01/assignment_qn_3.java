//Aassignment_qn_3
  public class assignment_qn_3{
  public static void main(String [] args){
//Enter Rafi's student id number     
  int student_id = 1000054943;
//Find the second last digit for the proggram using modulas function  
  int second_last_rightest_digit = student_id%10;
//Remove the last digit from Rafi's student id    
  int remove_last_digit = student_id/10;
//Find the first last digit for the proggram using modulas function   
  int first_last_rightest_digit = remove_last_digit%10;
//Print the disired output   
  System.out.println(second_last_rightest_digit +""+first_last_rightest_digit );
  }
 }