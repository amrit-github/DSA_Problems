package RecursionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubsets {

    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> ans = new ArrayList<>();

        printSubsets(arr, ans, 0);
    }

    static void printSubsets(List<Integer> arr, List<Integer> ans, int i){

        if(i == arr.size()){
            for(int ele : ans){
                System.out.print(ele + " ");
            }
            System.out.println();
            return;
        }

        ans.add(arr.get(i));
        printSubsets(arr, ans, i + 1);
        ans.remove(ans.size() - 1);
        printSubsets(arr, ans, i + 1);
    }

    /*
     *     
     * public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        printFn(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    static void printFn(int[] nums, List<List<Integer>> ans, List<Integer> temp, int i){
        if(i == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        printFn(nums, ans, temp, i + 1);
        temp.remove(temp.size() - 1);
        printFn(nums, ans, temp, i + 1);
    }
     */
}