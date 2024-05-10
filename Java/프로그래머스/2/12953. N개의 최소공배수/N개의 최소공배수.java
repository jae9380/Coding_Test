class Solution {
    public int solution(int[] arr) {
        return lcmOfNums(arr);
    }
    private static int lcmOfNums(int[] arr) {
        int lcm=1;
        for(int num : arr) {
            lcm = lcm(lcm,num);
        }
        return lcm;
    }
    private static int gcd(int a, int b) {
        while(b!=0) {
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
    private static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }
}