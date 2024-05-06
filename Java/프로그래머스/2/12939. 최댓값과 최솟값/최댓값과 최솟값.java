class Solution {
    public String solution(String s) {
        String answer = " ";
        int max=0, min=0;
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(i==0){
                max = Integer.parseInt(arr[i]);
                min = Integer.parseInt(arr[i]);
            }else{
                max = max<Integer.parseInt(arr[i]) ? Integer.parseInt(arr[i]) : max;
                min = min>Integer.parseInt(arr[i]) ? Integer.parseInt(arr[i]) : min;
            }
        }
        return min+answer+max;
    }
}