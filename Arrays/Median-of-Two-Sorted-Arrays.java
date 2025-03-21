class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length,n=nums2.length; 
       int merged[]=new int[m+n];
         int i = 0, j = 0, k = 0;
           while(i<m && j<n){
            if (nums1[i]>nums2[j]){
                merged[k++]=nums2[j++];
            }else{
                merged[k++]=nums1[i++];
            }
           }
           while(i<m){merged[k++]=nums1[i++];}
           while(j<n){merged[k++]=nums2[j++];}
            int mid=(m+n)/2;
            if(merged.length %2==0){
             return (merged[mid - 1] + merged[mid]) / 2.0; 
            } else{
            return merged[mid];            } 
    }
}
