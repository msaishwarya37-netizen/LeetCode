// Last updated: 7/19/2026, 11:48:44 PM
int removeDuplicates(int* nums, int numsSize) {
   int k=1;
   for(int i=1;i<(numsSize);i++)
   {
     if(nums[i]!=nums[i-1])
     {
        nums[k]=nums[i];
        k++;
      }
   }
   return k;
}