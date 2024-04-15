class Solution {
    public boolean solution(String s) {
        if(s.length()==4 || s.length()==6) {
            if(!s.matches(".*[a-zA-Z].*")) return true;
        } 
        return false;
    }
}