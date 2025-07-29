import java.util.Arrays;

public class SentencePanagram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println((isPanagram(sentence)));
    }
    static  boolean isPanagram(String sentence){

        boolean[] seen = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if(ch>='a'&&ch<='z'){
                seen[ch-'a'] = true;
            }
        }
        for (int i = 0; i < seen.length; i++) {
            if(!seen[i]){
                return false;
            }

        }
        return true;
    }
}
