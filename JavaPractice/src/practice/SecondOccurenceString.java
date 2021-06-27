package practice;

public class SecondOccurenceString {

	public static void main(String[] args) {
		
		String s="srirnusunrsirsn";
		String[] s2=s.split("");
		System.out.println("String size :"+s2.length);
		
		int fr=0;
		
		for (int i = 0; i < s2.length; i++) {
			 
			for (int j = i+1; j < s2.length; j++) {
				   
				
				if (s2[i].equalsIgnoreCase(s2[j])) {
					if (fr==0) {
						fr=j;
					}
					
					
					
					System.out.println(s2[j]);
					//if (i<j) {
						
						if (fr>j) {
							
							fr=j;
							
							System.out.println(fr);
							
						//}
						
						
						
					}
					
				}
				
			}
			
		}
		
		System.out.println(fr);
		System.out.println(s2[fr]);
		

	}

}
