package code;

public class ReverseString {
	
	public static void main(String[] args)  {
	
		String[] s = "My name is Swapy".split(" ");
	
		for (int i=s.length-1; i>=0 ;i--){
			
			System.out.println(s[i]+ " ");
		}
	}
}