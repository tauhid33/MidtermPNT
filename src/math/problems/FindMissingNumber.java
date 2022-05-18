package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        FindMissingNumber.missingNum(array);
    }

    public static int missingNum(int[] arr) {

        int n = arr.length + 1; // add the missing number to the given array.length
        int sum = (n * (n + 1)) / 2; // formula to find the sum of all n numbers.
        int sumOfArray=0;

        for (int i = 0; i < arr.length; i++) {
            sumOfArray = sumOfArray+ arr[i];
        }
        int missingNum= sum-sumOfArray;
        System.out.println("the missing number is: " + missingNum);
        return missingNum;
    }
}
