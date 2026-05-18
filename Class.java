import java.util.Scanner;

public class Class {

public static void main(String[] args) {


Scanner input = new Scanner(System.in);

System.out.println ("please enter your first number : ");

int first = input.nextInt();


System.out.println ("please enter your second number : ");


int second = input.nextInt();


if (second > first){
 first = second;
}
System.out.println ("please enter your third number : ");

int third = input.nextInt();

if (third > first){
first = third;
}
System.ou
