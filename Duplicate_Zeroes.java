DuplicateZeroes


class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                for(int l=arr.length-1;l>i;l--){
                    arr[l]=arr[l-1]; 
                }
                arr[i+1]=0;
                i++;
            }
        }
       
        
    }
}