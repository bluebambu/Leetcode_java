import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        qsort(nums, 0, nums.length); 
        System.out.println(Arrays.toString(nums)); 
    }

    public int swap(int a, int b) { // usage: y = swap(x, x=y);
        return a;
    }

    public void qsort(int[] nums, int start, int end) {
        System.out.println(Integer.toString(start) + " " + Integer.toString(end));
        System.out.println(Arrays.toString(nums)); 
        System.out.println();
        if (start >= end - 1) {
            return;
        }

        int pivot = nums[start];
        int l = start + 1;
        int r = end;
        while (l < r) {
            while (l < r && nums[l] < pivot)
                l++;
            while (l < r && nums[r-1] >= pivot)
                r--;
            if (l >= r)
                break;
            
            nums[r-1] = swap(nums[l], nums[l]=nums[r-1]);
        }            
        nums[l-1] = swap(nums[start], nums[start]=nums[l-1]); 
        qsort(nums, start, l-1);
        qsort(nums, l, end); 
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf(-13123).equals(-13123));
        Solution s = new Solution(); 
        // s.sortColors(new int[] {2,0,2,1,1,0});
    }
}