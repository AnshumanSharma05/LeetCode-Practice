Pascals's Triangle
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]



class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        if(numRows==0) return triangle;
        List<Integer> firstrow=new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);
        for(int i =1;i<numRows;i++){
            List<Integer> prev_row=triangle.get(i-1);
            List<Integer> curr_row=new ArrayList();
            curr_row.add(1);
            for(int j=1;j<i;j++){
                curr_row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            curr_row.add(1);
            triangle.add(curr_row);
            
        }
        return triangle;
        
    }
}