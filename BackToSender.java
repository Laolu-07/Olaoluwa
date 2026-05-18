import java.util.Scanner;
   public class BackToSender{
    public static void main (String[] args){
Scanner input = new Scanner(System.in);
int RidersPayment = 0;
    System.out.print ("enter a rate of delivery made today: ");
int  CollectionRate = input.nextInt();
    if (CollectionRate < 50){
RidersPayment = CollectionRate * 160 + 5000;
System.out.println ("your payment is " + RidersPayment + " due to low delivery made." );
}
else
    if (CollectionRate >= 50 && CollectionRate <= 59) {
RidersPayment = CollectionRate * 200 + 5000;
System.out.print ("your payment is " + RidersPayment + " due to low delivery made.");
    }
    if (CollectionRate >= 60 && CollectionRate <= 69) {
RidersPayment = CollectionRate * 250 + 5000;
System.out.print ("your payment is " + RidersPayment + " due to low delivery made.");
    }
    if (CollectionRate >= 70){
RidersPayment = CollectionRate * 160 + 5000;
System.out.println ("your payment is " + RidersPayment + " due to low delivery made." );

}
else {
System.out.print ("invalid entry.");
    }


     
        }    
    }
