package BinarySearch;

public class BinarySearch {

    static void main() {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println("The target is at index: " + BS(nums,2));

    }

    static int BS(int[] nums , int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}

