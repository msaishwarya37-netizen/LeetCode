// Last updated: 7/19/2026, 11:46:40 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
            String str=s+s;
            return str.contains(goal);
        }
    }
