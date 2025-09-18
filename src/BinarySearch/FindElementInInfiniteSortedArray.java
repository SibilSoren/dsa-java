package BinarySearch;

public class FindElementInInfiniteSortedArray {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("The element is at index: " + search(arr,7));
    }

    public static int search(int[] nums, int target){
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            start = end;
            end = end * 2;
        }
        return BS(nums,target,start,end);
    }

    public static int BS(int[] nums,int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
