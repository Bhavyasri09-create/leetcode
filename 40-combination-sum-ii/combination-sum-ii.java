class Solution {
    static void f(int index,int []candidates,int target,int sum,List<Integer> current,List<List<Integer>> result){
        if(sum==target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(sum>target) return;
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            current.add(candidates[i]);
            f(i+1,candidates,target,sum+candidates[i],current,result);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        Arrays.sort(candidates);
        f(0,candidates,target,0,current,result);
        return result;
    }
}