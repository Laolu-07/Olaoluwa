public class LargestNumber {
    public static int Number(int first, int second, int third ){
    int largest = first;

    if (largest < second)
    largest = second ;
else if (largest < third)
    largest = third ;
    return largest;
}

    public static void main(String[] args){
        System.out.println(Number(-9 , 0 , -3));
    }
}
