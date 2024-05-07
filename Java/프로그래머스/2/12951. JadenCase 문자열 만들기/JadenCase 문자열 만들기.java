class Solution {
    public String solution(String s) {
        s= s+"z";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            if (str.length()==0) {
                sb.append(" ");
            }else {
                if(!Character.isDigit(str.charAt(0))) {
                    sb.append(str.substring(0,1).toUpperCase());
                    sb.append(str.substring(1,str.length()).toLowerCase());
                }else{
                    for(int j=0; j<str.length();j++) {
                        if(!Character.isDigit(str.charAt(j))) {
                            sb.append(str.substring(0,j));
                            sb.append(str.substring(j,str.length()).toLowerCase());
                            break;
                        }
                    }
                }
                if(i!=arr.length-1)sb.append(" ");
            }
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}