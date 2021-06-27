package practice;

public class SecondReccurenceInString {

	public static void main(String[] args) {
		
		String s1="srinuirs";
		
		String[] s2=s1.split("");
		
		System.out.println(s2.length);
		
		int fr=0;
		
		for (int i = 0; i < s2.length; i++) {
			
			for (int j = i+1; j < s2.length; j++) {
				
				if (s2[i].equalsIgnoreCase(s2[j])) {
					
					if (i<j) {
						
						
						
					}
					
				}
				
			}
			
		}
		

	}

}
