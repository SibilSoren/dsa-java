package BinarySearch;

public class LastOccurrenceOfAnElement {
    static void main() {
        int[] nums = {1,2,3,4,4,4,5,5,6,6,6,6};
        System.out.println("Last occurrence is at index: " + getLastOccurrence(nums,4));
    }

    static int getLastOccurrence(int[] nums , int target){
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                result = mid;
                start = mid + 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }
}
