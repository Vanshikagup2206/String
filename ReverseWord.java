package String;

public class ReverseWord {
    public String reverseWords(String s) {
        String[] result = s.trim().split("\\s+");
        int i = 0, j = result.length - 1;
        while(i < j){
            String temp = result[i];
            result[i] = result[j];
            result[j] = temp; 
            i++;
            j--;
        }
        return String.join(" ", result);
    }
    public static void main(String args[]){
        String s = "welcome to the jungle";
        ReverseWord sol = new ReverseWord();
        System.out.println(sol.reverseWords(s));
    }
}