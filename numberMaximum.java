/*public class numberMaximum {
    public static void main (String [] args){
  int maximum = 
        if (a > b) {
            return a;
        } else {
            return b;
        }
            System.out.println( maximum )
    }
}*/
public class NumberMethods {
    
    // 1. Maximum of two numbers
    public static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        // or just: return a > b ? a : b;
    }
}
