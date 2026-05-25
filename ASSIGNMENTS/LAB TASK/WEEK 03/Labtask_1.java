//Assignment 3
import java.util.Scanner;
public class Labtask_1{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);  
int temp =1;
for (int i =24; i>=-6; i-=6){
if (i==-6){
System.out.print(i);
}
else {
System.out.print(i + ",");
}
}
for (int i = 2; i <= 7; i++) {
            int value = i * 9;
            if (i % 2 != 0) {
                value = -value;
            }
            if (value==-63){
            System.out.print( value);
            }
            else{System.out.print( value+" ,");}
}
}
}


