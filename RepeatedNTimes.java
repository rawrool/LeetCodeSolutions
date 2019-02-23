import java.util.HashSet;
import java.util.Set;

public class RepeatedNTimes{
	public static void main(String[] args) {
		
	}
	
	public int repeatedNTimes(int[] A) {
		
		Set<Integer> hSet = new HashSet<Integer>();
		
		for(int i: A) {
			if(hSet.contains(i)) {
				return i;
			}
			else {
				hSet.add(i);
			}
		}
		
		return 0;
	}
	
}