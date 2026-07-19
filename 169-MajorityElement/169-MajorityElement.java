// Last updated: 7/19/2026, 11:47:45 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            map.put(x,map.getOrDefault(x,0)+1);
        }
        Integer[] keys=map.keySet().toArray(new Integer[map.size()]);
        for(int i=0;i<nums.length;i++){
            int key=keys[i];
            if(map.get(key)>nums.length/2)
            return key;
        }
        return -1;
    }
}