public class SortedSquares{
	public static void main(String[] args) {
		
	}
	
    public static int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int m = A.length -1; 
        int n = 0;
        for(int i = A.length-1; i >= 0; i--) {
        	if(Math.abs(A[n]) > Math.abs(A[m])) {
        		result[i] = A[n]*A[n];
        		n++;
        	}else {
        		result[i] = A[m]*A[m];
        		m--;
        	}
        }
        
        return result;
    }
}