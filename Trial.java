import java.util.Scanner;
public class Trial{
public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter number");
int number = inputCollector.nextInt();
int sum = 0;
    int i = number;
while(i > 0){
int digit = i % 10;
 sum = sum + digit;
 i /= 10;
int square = digit * digit;
System.out.println(square);
}

    }

}
