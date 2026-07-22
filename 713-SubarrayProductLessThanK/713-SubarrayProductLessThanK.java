// Last updated: 7/22/2026, 10:42:15 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3       HashMap<Integer,Integer> map=new HashMap<>();
4       List<Integer> ans=new ArrayList<>();
5       for(int i=0;i<nums.length;i++){
6       if(map.containsKey(nums[i])){
7         map.put(nums[i],map.get(nums[i])+1);
8         if(map.get(nums[i])==2){
9         ans.add(nums[i]);
10         }
11       }
12         else{
13         map.put(nums[i],1);
14       }
15       }
16       return ans;
17    }
18}