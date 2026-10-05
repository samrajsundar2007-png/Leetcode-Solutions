class Solution {
    public String toLowerCase(String s) {
        char ch[] = s.toCharArray();
        for(int i = 0; i<ch.length;i++){
            ch[i] = Character.toLowerCase(ch[i]);
        }
        StringBuilder bd = new StringBuilder();
        for(int i = 0; i<ch.length;i++){
            bd.append(ch[i]);
        }
        return bd.toString();
    }
}