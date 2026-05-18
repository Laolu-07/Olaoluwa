public class practice{
    public static void main (String [] args){
//    int numbers [] = {2, 3, 4, 5, 6, 7};
//    numbers[3] = 9;
//   
//    int act = numbers.length;   
//System.out.print (act);
//int max = numbers[0];
//for (int act = 0; act < numbers.length; act++){
//
//if (numbers[act] > max)
//max = numbers[act];
//}
//System.out.print (max);
//   }
//}
//int  = numbers[0];
//for (int act = 0; act < numbers.length; act++){
//
//if (numbers[act] < min)
//min = numbers[act];
//}
//System.out.print (min);
//   }
//}
//}
//public static int ClassTasks(String num) {
//    int count = 0;
//    for (int amount = 0; amount < num.length(); amount++) {
//        count++;
//    }
//    
//    return count;
//}
//}
//
//public class practice {
//    public static void main(String[] args) {
//        int result = number("olaoluwa");
//        System.out.println(result);
//    }
//    
//    static int number(String s) {
//        int count = 0;
//        for (int amount = 0; amount < s.length(); amount++) {
//            count++;
//        }
//        return count;
//    }
//}
//
//import java.util.Scanner;
//
//public class Traffic{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Enter color: ");
//        String color = input.nextLine();
//        
//        if (color == "green") {
//            System.out.println("go");
//        } else if (color == "yellow") {
//            System.out.println("ready");
//        } else if (color == "red") {
//            System.out.println("stop");
//        }
//        
//
//    }
//}
//import java.util.Scanner;
//
//public class Traffic {
//    
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Enter a number: ");
//        int number = input.Int();
//        
//        color = color.toLowerCase();
//        
//        if (color.equals("green")) {
//            System.out.println("GO");
//        } else if (color.equals("yellow")) {
//            System.out.println("GET READY");
//        } else if (color.equals("red")) {
//            System.out.println("STOP");
//        } else {
//            System.out.println("UNKNOWN");
//        }
//        

//        
//              
//    import java.util.Scanner;
//
//public class Traffic {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int option = 0;
//        
//        while (option != 7) {
//        System.out.print ("Enter number: ");
//        option = input.nextInt();
//        if (option == 7){
//        System.out.println("CORRECT");
//        }
//        if (option > 7){
//        System.out.println("ABOVE");
//        }
//        if(option < 7){
//    System.out.println("BELOW");
//        }
//    }
//  }
//}
//    
//public class Traffic {
//    public static void main(String[] args) {
//        System.out.println(isEven(3)); 
//    }
//    
//    public static boolean isEven(int number) {
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
//
//
//
//
//public class Traffic {
//    
//    public static int subtraction(int a, int b) {
//        if (a > b) {
//            return a - b;
//        } else {
//            return b - a;
//        }
//    }
//    
//    public static void main(String[] args) {
//        int a = 4;
//        int b = 9;
//        System.out.println(subtraction(a, b));  // Positive result 5
//int [] num = {3, 4, 5, 6, 7, 9};
//int sum = 0;
//    for (int count = 0; count < num.length; count++){
//    System.out.println (num[count]);
//    sum = sum + count;
//System.out.print(sum);
//}
//    }
//}
//
import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        
        while (option != 7) {
            System.out.print("try again: ");
            option = input.nextInt();
            
            if (option == 7) {
                System.out.println("Correct ");
            } else {
                System.out.println("You selected: " + option);
            }
        }
    }
}
