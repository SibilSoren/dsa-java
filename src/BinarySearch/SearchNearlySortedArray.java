package BinarySearch;

public class SearchNearlySortedArray {
    static void main() {
        int[] arr = {5,10,30,20,45};
        System.out.println("Item is at index: " + search(arr,45));
    }

    public static int search(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid= start + (end - start)/ 2;
            if(nums[mid] == target) {
                return mid;
            }else if (mid - 1 >= start && nums[mid - 1] == target){
                return mid - 1;
            }else if(mid + 1 <= end && nums[mid + 1] == target){
                return mid + 1;
            }else if(nums[mid] < target){
                start = mid + 2;
            }else{
                end = mid - 2;
            }
        }
        return -1;
    }
}
