package BinarySearch;

public class FirstOccurrenceOfAnElement {
    static void main() {
        int[] nums = {1,2,3,4,4,4,5,5,6,6,6,6};
        System.out.println("First occurrence is at index: " + getFirstOccurrence(nums,5));
    }

    public static int getFirstOccurrence(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                result = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid  + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }

}
