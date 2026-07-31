// Last updated: 7/31/2026, 8:01:26 PM
1class Solution {
2    public int compress(char[] chars) {
3        int n=chars.length;
4        int index=0;
5        for(int i=0;i<n;i++){
6            char current=chars[i];
7            int count=0;
8
9            while(i<n && chars[i]==current){
10                count++;
11                i++;
12            }
13            if(count==1){
14                chars[index++]=current;
15            }
16            else
17            {
18                chars[index++]=current;
19                for(char digit:Integer.toString(count).toCharArray()){
20                    chars[index++]=digit;
21                }
22            }
23            i--;
24        }
25        return index;
26        }
27
28    }
29