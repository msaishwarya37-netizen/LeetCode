// Last updated: 7/19/2026, 11:47:32 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candi1=0;
        Integer candi2=0;
        Integer count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candi1){
            count1++;
            }
            else if(nums[i]==candi2){
            count2++;
            }
            else if(count1==0){
            candi1=nums[i];
            count1++;
            }
            else if(count2==0){
            candi2=nums[i];
            count2++;
            }
            else{
            count1--;
            count2--;
        }
    }
    count1=0;
    count2=0;
    for(int i=0;i<nums.length;i++){
    if(nums[i]==candi1)
    count1++;
    else if(nums[i]==candi2)
    count2++;
    }
    List<Integer> result=new ArrayList<>();

    if(count1>nums.length/3)
    result.add(candi1);
    if(count2>nums.length/3)
    result.add(candi2);
    return result;
}
}