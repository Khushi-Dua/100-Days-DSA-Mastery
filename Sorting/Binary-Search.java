class Solution {
    public int search(int[] nums, int target) {
       int start=0,end=nums.length-1;
       
       boolean isAsc=nums[start] < nums[end];
       while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if (isAsc==true){
            if (nums[mid]>target){
                end=mid-1;
            }else if (nums[mid]<target){
                start=mid+1;            }
        }
        if (isAsc==false){
            if (nums[mid]<target){
                start=mid+1;
            }else if (nums[mid]>target){
                end=mid-1;
            }
        }
       }return -1;
    }
}
