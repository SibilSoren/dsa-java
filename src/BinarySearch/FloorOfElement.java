package BinarySearch;

public class FloorOfElement {
    static void main() {
//        int[] arr = {1,2,3,4,8,9,10,11,12,14};
        int[] arr = {5, 8, 9, 10};
        System.out.println("Floor element index is: " + getFloorElement(arr,3));
    }

    public static int getFloorElement(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int res = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return nums[mid];
            }else if(nums[mid] < target){
                res = mid;
                start = mid  + 1;
            }else {
                end = mid - 1;
            }

        }
        return (res == -1) ? -1 : nums[res];
    }
}
