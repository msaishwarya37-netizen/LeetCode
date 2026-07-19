// Last updated: 7/19/2026, 11:46:15 PM
class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
       HashMap<Integer,Integer>map=new HashMap<>();
       map.put(0,1);
       int sum=0;
       int count=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(map.containsKey(sum-target)){
            count++;
            sum=0;
            map.clear();
            map.put(0,1);
        }
        else
        map.put(sum,1);
        
       }
       return count; 
    }
}