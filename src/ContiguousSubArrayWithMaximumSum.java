public class ContiguousSubArrayWithMaximumSum {

    private void getSubArrayWithMaxSum(int[] inputArray) {
        int bestStart = 0;
        int bestEnd = 0;
        int currSum = 0, bestSum = 0;
        int currStart = 0;

        for (int i = 0; i < inputArray.length; i++) {
            currSum = currSum + inputArray[i];

            if (currSum < 0) {
                currSum = 0;
                currStart = i+1;
            } else if (currSum > bestSum) {
                bestSum = currSum;
                bestEnd = i;
                bestStart = currStart;
            }
        }

        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        ContiguousSubArrayWithMaximumSum obj = new ContiguousSubArrayWithMaximumSum();
        obj.getSubArrayWithMaxSum(new int[]{2, -3, 7, -4, 2, 5, -8, 6, -1});
    }
}
