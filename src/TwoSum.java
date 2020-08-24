//Given an array of integers, return indices of the two numbers such that they add up to a specific target.


import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] numArr, int target) {
        int [] pos = new int[0];
        for(int i =0;i<numArr.length;i++) {
            for(int j = i+1;j<numArr.length;j++){
                if(numArr[i]+numArr[j]==target)
                    return new int[]{i,j};
            }
        }

        return pos;

    }
    public static void main(String a[]) {
        TwoSum s = new TwoSum();
        int[] numArr = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(s.twoSum(numArr,9)));
    }
    }
