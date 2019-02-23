import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations{
	public static void main(String[] args) {
		
	}
	
    public static int uniqueMorseRepresentations(String[] words) {
        
        Set<String> hs = new HashSet<String>();
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String s : words){
            String t = "";
            for(char c: s.toCharArray()){
                t += morse[c - 'a'];
            }
            hs.add(t);
        }
        
        return hs.size();
    }
}