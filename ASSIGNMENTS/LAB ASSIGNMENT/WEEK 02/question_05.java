//Question_05
 import java.util.Scanner;
 public class question_05{
 public static void main (String [] args){
 Scanner sc = new Scanner (System.in);
//Enter the amount the customer need to pay(Taka)
 System.out.println("Enter the amount the customer need to pay(Taka) ");
 int pay = sc.nextInt();
// Enter the amount the customer need to pay(Taka) 
 System.out.println("Enter the amount the customer paid(Taka) ");
 int paid = sc.nextInt();
// Find out the amount to be returend and notes
 if ( paid > pay){
 int give_back =  paid-pay;
 System.out.println("The returned amount is " + give_back  + " TK" );
 if (give_back>=100){
 int Note = give_back/100;
 int TK_remain = give_back%100;
 System.out.println("100 taka note: " +Note );
 give_back = TK_remain;
   } 
 if (give_back>=50){
 int Note = give_back/50;
 int TK_remain = give_back%50;
 System.out.println("50 taka note: " +Note );
 give_back = TK_remain;   
   }
 if (give_back>=20){
 int Note = give_back/20;
 int TK_remain = give_back%20;
 System.out.println("20 taka note: " +Note );
 give_back = TK_remain;
   }   
 if (give_back>=10){
 int Note = give_back/10;
 int TK_remain = give_back%10;
 System.out.println("10 taka note: " +Note );
 give_back = TK_remain;
   }   
 if (give_back>=5){
 int Note = give_back/5;
 int TK_remain = give_back%5;
 System.out.println("5 taka coin: " +Note );
 give_back = TK_remain;
   }
 if (give_back>=2){
 int Note = give_back/2;
 int TK_remain = give_back%2;
 System.out.println("2 taka coin: " +Note );
 give_back = TK_remain;
   }
 if (give_back>=1){
 int Note = give_back/1;
 int TK_remain = give_back%1;
 System.out.println("1 taka coin: " +Note );
 give_back = TK_remain;
  }
  }
 else if (pay>paid){
 System.out.println("Customer still have to pay  " +(pay-paid) + " TK" );
  }
  
 else {
 System.out.println("The returned amount is 0 taka.  "  );
  }
 }
 }
   
    
  
 
 
 

 
