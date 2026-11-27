class Solution {
    static void f(int index,int []nums,List<Integer> curr,
    List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            f(i+1,nums,curr,res);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        f(0,nums,curr,res);
        return res;
    }
}