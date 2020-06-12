Squares of a Sorted Array


class Solution {
    public int[] sortedSquares(int[] A) {
        int len=A.length;
        int arr[]=new int[len];
        for (int i=0 ;i<A.length;i++){
            arr[i]=A[i]*A[i];
        }
        Arrays.sort(arr);
        return arr;
        
    }
}