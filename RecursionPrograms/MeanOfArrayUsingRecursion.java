package RecursionPrograms;

public class MeanOfArrayUsingRecursion {

    public static void main(String[] args) {

        int[] nums = {43,56,59,65,90,1008};
        double meanVal = mean(nums, 0);
        System.out.println(meanVal / nums.length);
    }

    static double mean(int[] nums, int i){

        if(nums.length == 1) return (double)nums[0];
        if(i < nums.length){
            return (double)(nums[i] + mean(nums, i + 1));
        }
        return 0;
    }
}