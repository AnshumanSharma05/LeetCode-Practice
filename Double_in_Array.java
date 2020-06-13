Check if n and its double exist?
1 test case failed. to do

class Solution {
    public boolean checkIfExist(int[] arr) {
        if(arr==null || arr.length==0) return false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}