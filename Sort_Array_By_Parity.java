SortArray by parity

class Solution {
    public int[] sortArrayByParity(int[] A) {
       int arr[]=new int[A.length];
        int k=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                arr[k]=A[i];
                k++;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]%2==1){
                arr[k]=A[i];
                k++;
            }
        }
        return arr;
    }
}