package BinarySearch;

public class TimesSortedArrayRotated {
    static void main() {
        int[] arr = {8,11,12,15,18,2,5,6};
        System.out.println("The array is rotated by: " + getTimesRotated(arr) + " times");
    }

    public static int getTimesRotated(int[] nums){
        int n = nums.length;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if(nums[start] <= nums[end]){
                return start;
            }

            if(nums[mid] <= nums[prev] && nums[mid] <= nums[next]){
                return mid;
            }else if(nums[start] <= nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
    return -1;
    }
}
