class Solution {
    static void ans(int i,int []nums,List<Integer> current,List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        //include or add the elements
        current.add(nums[i]);
        ans(i+1,nums,current,result);
        //backtracking
        current.remove(current.size()-1);
        //exclude the elements
        ans(i+1,nums,current,result);
    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        ans(0,nums,current,result);
        return result;
    }
}