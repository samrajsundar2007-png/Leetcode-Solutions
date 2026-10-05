class Solution {
    public String reverseWords(String s) {
        String[] str =s.trim().split("\\s+");
        StringBuilder bd = new StringBuilder();
        for(int i = str.length-1; i >= 0;i--){
           bd.append(str[i]);
           if(i != 0){
            bd.append(" ");
           }
        }
        return bd.toString();
    }
}