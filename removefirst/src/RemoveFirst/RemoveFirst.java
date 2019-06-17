package RemoveFirst;
public class RemoveFirst {
	public String removeFst(String s){
		String ans = "";
		int i = 0;
		int n = s.length();
		for(i=0;i<n;i++){
			if((i == 0 || i == 1) && s.charAt(i) == 'A'){
				continue;
			}
			else{
				ans += s.charAt(i);
			}
		}
		return ans;
		
	}
}
