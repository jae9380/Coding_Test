class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        return func(name,yearning,photo);
    }
    private static int[] func(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];
        int count =0;
        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                for(int k=0;k<name.length;k++){
                    if(photo[i][j].equals(name[k])){
                        count+=yearning[k];
                    }
                }
            }
            result[i]=count;
            count=0;
        }
        return result;
    }
}