class Solution {
    public String solution(String new_id) {
        //step1
        new_id = new_id.toLowerCase();
        //step2
        new_id = new_id.replaceAll("[^a-z0-9_\\-\\.]","");
        //step3
        new_id = new_id.replaceAll("\\.+",".");
        //step4
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        //step5
        if(new_id.isEmpty()) new_id="a";
        //step6
        if(new_id.length()>15){
            if(new_id.charAt(14)==46){
                new_id = new_id.substring(0,14);    
            }else{
                new_id = new_id.substring(0,15);    
            }
        }
        //step7
        if(new_id.length()<3) {
            while(true){
                new_id+=new_id.charAt(new_id.length()-1);
                if(new_id.length() ==3) break;
            }
        }
        return new_id;
    }
}