package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int firstNum = 0;
        int secondNum = 1;

        for(int i = 1;i<=40; i++){
            System.out.print(firstNum + ", ");

            int thirdNum = firstNum + secondNum;
            firstNum =secondNum;
            secondNum = thirdNum;



        }






    }
}
