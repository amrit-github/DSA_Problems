package RecursionPrograms;

public class BinarySearchRecursive {
    
    public static void main(String[] args) {
        
        System.out.println(search(new int[]{43,56,59,65,90,1008}, 90));
    }

    public static int search(int[] nums, int target) {
        
        return search(nums, target, 0, nums.length - 1);
    }

    static int search(int[] nums, int target, int start, int end){

        if(start > end) return -1;
        int mid = (start + end) / 2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] < target){
            return search(nums, target, mid + 1, end);
        }
        return search(nums, target, start, mid - 1);
    }
}