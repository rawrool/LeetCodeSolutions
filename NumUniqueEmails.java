import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails{
	public static void main(String[] arg) {
		
	}
	
    public static int numUniqueEmails(String[] emails) {
    	
    	Set<String> unique = new HashSet<String>();
    	
    	for(String s: emails){
    		String local = s.substring(0, s.indexOf('@'));
    		if(local.indexOf('+') > 0) {
    			local = local.substring(0, local.indexOf('+'));	
    		}
    		local = local.replace(".", "");
    		String domain = s.substring(s.indexOf('@'));
    		
            unique.add(local+domain);
        }
    	
    	return unique.size();
    }
}