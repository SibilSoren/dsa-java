package BinarySearch;

public class SearchRotatedSortedArray {
    static void main() {
        int[] nums = {1};
        System.out.println("Found index is: " + getElement(nums,1));
    }

    public static int getElement(int[] nums, int target){
        if(nums.length == 0) return -1;
        if(nums.length == 1 && nums[0] == target){
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        int minElementIndex = getMinElementIndex(nums);
        int foundInLeft = basicBS(nums,target,start,minElementIndex - 1);
        int foundInRight  = basicBS(nums,target,minElementIndex, end);

        if(foundInLeft != -1) return foundInLeft;
        if(foundInRight != -1) return foundInRight;

        return -1;
    }

    public static int basicBS(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int getMinElementIndex(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;
            if(nums[start] <= nums[end]){
                return start;
            }

            if(nums[mid] < nums[prev] && nums[mid] < nums[next]){
                return mid;
            }
            else if (nums[start] <= nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
