package String.Easy;

public class LargestOddNo {    
    public String largeOddNum(String s) {
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) % 2 != 0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String args[]){
        String s = "5347";
        LargestOddNo sol = new LargestOddNo();
        System.out.println(sol.largeOddNum(s));
    }
}