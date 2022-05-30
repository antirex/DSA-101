class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> dum = new ArrayList<>();
            int temp = 1;
            for(int j=0;j<=i;j++)
            {
             dum.add(temp);
             temp = temp*(i-j)/(j+1);
            }
            res.add(dum);
        }
        return res;
        
    }
}