public class NumJewelsInStones{
	public static void main(String[] arg) {
		
	}
	
	public static int numJewelsInStones(String J, String S) {
		int counter = 0;
    	
    	for(char c: J.toCharArray()) {
			for(char d: S.toCharArray()) {
				if(c == d) {
					counter++;
				}
			}
		}
    	return counter;
    }
}