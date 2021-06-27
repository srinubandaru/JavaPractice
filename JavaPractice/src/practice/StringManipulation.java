package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringManipulation {

	public static void main(String[] args) {
		
		
	//	String ss="fff20,5ggg05.75ggg   ";
		
	//	String dd=ss.trim().replaceAll("[a-zA-Z,]", "");
		
	//	System.out.println(dd);
		
		//String
		
		
		String d="55.05hhhh";
		String d2="55.000008";
		String d3="55.00999ghghgh";
		
		List<String> rawlist=new ArrayList<>();
		
		rawlist.add(d);
		rawlist.add(d2);
		rawlist.add(d3);
		
		;
		System.out.println(listsorted(rawlist));
		
		/*Float s=Float.parseFloat(d);
		Float s2=Float.parseFloat(d2);
		Float s3=Float.parseFloat(d3);
		
		Float s4=Float.parseFloat(ss);
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		List<Float> fList=new ArrayList();
		fList.add(s);
		fList.add(s2);
		fList.add(s3);
		
		fList.add(s4);
		
		System.out.println(fList);
		
		 Collections.sort(fList);
		 
		 System.out.println("After ascending order : "+fList);
		
		//fList.sort(As);
*/		
		
		
		

	}
	
	
	
	public static List<Float> listsorted(List<String> sList) {
		
		List<Float> fList=new ArrayList<>();
		
		if (sList!=null) {
			
			
			
			for (String str1 : sList) {
				
				if (str1!=null) {
					
					String reqStr=str1.trim().replaceAll("[a-zA-Z,]", "");
					Float reqFloat=Float.parseFloat(reqStr);
					
					fList.add(reqFloat);
					
					
				}
				
				
				
				
				
			}
			
			
			
			Collections.sort(fList);
			
		}
		
		
		return fList;
		
	}
	
	
	

}
