import java.util.Scanner;
public class justpractice {
   public static void main (String []args){
   Scanner input = new Scanner (System.in);
System.out.print ("enter number: ");
int number = input.nextInt();
boolean isPrime = methods (number);
System.out.print (isPrime);
//    int a = 3;
//    int b = 5;
//System.out.print (methods(a, b));
//
    }
public static boolean methods (int number){
    if (number % 2 == 1){
    return true;
    }
    else {
    return false;
    
}
  }
}
