package Mate.Book.FindSmallestElement;

public class FindSmallestElement {
    public static int findSmallestElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        if(nums==null ||nums.length==0 )
            return 0;
        for(int i=0;i<nums.length;i++){
            if (min > nums[i]){
                min = nums[i];
            }

        }
        System.out.println(min);
        return min;
    }

    public static void main(String[] args) {
        int[] nums={-4,5,-8};
        int [] nums2=new int[2];
       int[] nums3=new int[0];
       int[] nums4=null;
       int [] nms={-199,-2356,45};
        findSmallestElement(nums);
        findSmallestElement(nums2);
       findSmallestElement(nums3);
       findSmallestElement(nums4);
       findSmallestElement(nms);
    }
}
