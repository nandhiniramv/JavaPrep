import java.util.Arrays;

public class RunningSums {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(RunningSums.runningSum(new int[]{2, 3, 4, 5, 6})));
    }
    public static int[] runningSum(int[] num) {
        int []result = new int[num.length];
        result[0]=num[0];
        for (int i=1;i<num.length;i++) {
            result[i] = result[i-1]+ num[i];
        }
        return result;
    }

}
