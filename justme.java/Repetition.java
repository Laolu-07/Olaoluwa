
public class Repetition.java {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int number = 0; 
total = 0;
System.out.print("Enter number, 0 to stop: ");
num = input.nextInt();

while (number != 0) {          
    total += number;
    System.out.print("Enter number, 0 to stop: ");
    number = input.nextInt();
}
System.out.println("Total: " + total);
}
    }
