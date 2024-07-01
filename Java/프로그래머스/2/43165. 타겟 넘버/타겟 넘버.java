class Solution {
    static int count=0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers,0,target,0);
        return count;
    }
    private static void dfs(int[]numbers,int node, int target, int result){
         if(node == numbers.length) {
             if(target==result) count++;
            return;
         }
        int p = result+numbers[node], m = result-numbers[node];
    
        dfs(numbers,node+1,target,p);
        dfs(numbers,node+1,target,m);
    }
}