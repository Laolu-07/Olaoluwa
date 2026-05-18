public class teaccher{
    public static void main (String [] args){
    int [] scores = {3, 5, 2, 1, 7, 8};
    System.out.print (TaskOne(scores));
    }
public static int TaskOne(int [] scores){
int noOfEvenScores = 0;
//for (int score : scores){
//    if (Score % 2 == 0){
//        noOfEvenScores++;
//    }
//}
for (int index = 0; index < scores.length; index++) {
    if (scores [index] % 2 == 0){
    noOfEvenScores++;
    }
}
return noOfEvenScores;
    }
}
