package String;

public class LongestCommonPrefix {    
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        StringBuilder common = new StringBuilder();
        String first = strs[0];
        for(int i = 0; i < first.length(); i++){
            char c = first.charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != c)
                    return common.toString();
            }
            common.append(c);
        }
        return common.toString();
    }
    public static void main(String args[]){
        String[] str = {"flowers" , "flow" , "fly", "flight"};
        LongestCommonPrefix sol = new LongestCommonPrefix();
        System.out.println(sol.longestCommonPrefix(str));
    }
}