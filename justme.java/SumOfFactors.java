import java.util.Scanner;

public class stars {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print ("Please enter a digit to find its factor: ");
        int digit = input.nextInt();
        int sum = 0;

        for (int factor = 2; factor <= digit; factor++){
            if (digit % factor == 0) {
            System.out.println(factor);
            
       }
        System.out.println (sum);
}
}
