// Last updated: 7/20/2026, 11:56:30 PM
1class Solution {
2    public void wiggleSort(int[] nums) {
3        int n=nums.length;
4        int [] temp=nums.clone();
5        Arrays.sort(temp);
6        int left=(n-1)/2;
7        int right=(n-1);
8        for(int i=0;i<n;i++){
9            if(i%2==0){
10                nums[i]=temp[left--];
11            }
12            else
13            nums[i]=temp[right--];
14        }
15    }
16}