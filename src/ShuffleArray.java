import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        if(nums.length!=2*n)
        return null;
        int result[] = new int[2*n];
        for(int i=0,j=0;i<n;i++,j++){
            result[j] = nums[i];j++;
            result[j]= nums[i+n];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                ShuffleArray.shuffle(new int[]{7,5,3,6,4,2},3)));
    }
}
