package BinarySearch;

public class CountOfAnElement {
    static void main() {
        int[] nums = {1,2,3,4,4,4,5,5,6,6,6,6};
        System.out.println("Total count is: " + getCountOfElement(nums,1));
    }

    static int getCountOfElement(int[] nums, int target){
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        FirstOccurrenceOfAnElement fO = new FirstOccurrenceOfAnElement();
        LastOccurrenceOfAnElement lO = new LastOccurrenceOfAnElement();
        int lastIndex = lO.getLastOccurrence(nums,target);
        int firstIndex = fO.getFirstOccurrence(nums,target);

        if(lastIndex == -1 || firstIndex == -1){
            return -1;
        }
        return (  lastIndex - firstIndex ) + 1;
    }
}
