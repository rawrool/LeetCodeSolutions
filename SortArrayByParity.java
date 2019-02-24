public class SortArrayByParity{
	public static void main(String[] args) {
		
	}
	
	public int[] sortArrayByParity(int[] A) {
		
		int[] result = new int[A.length];
		
		int i = A.length-1;
		int j= 0;
		
		for(int a: A) {
			if(a%2!=0) {
				result[i] = a;
				i--;
			}else {
				result[j] = a;
				j++;
			}
		}
		
		return result;
	}
	
}