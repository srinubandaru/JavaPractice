package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedFloatList {

	public static void main(String[] args) {
		
		String d="55,500.05";
		String d2="5  5.000008";
		String d3="55.00999 ghghgh";
		
		List<String> rawlist=new ArrayList<>();
		
		rawlist.add(d);
		rawlist.add(d2);
		rawlist.add(d3);
		
		
		System.out.println(listsorted(rawlist));
		
		for (Float f : listsorted(rawlist)) {
			
			System.out.println(f);
			
			
		}

	}
	
	
	
public static List<Float> listsorted(List<String> sList) {
		
		List<Float> fList=new ArrayList<>();
		
		if (sList!=null) {
			
			
			
			for (String str1 : sList) {
				
				if (str1!=null) {
					
					String reqStr=str1.trim().replaceAll("[a-zA-Z,\\s]", "");
					
					Float reqFloat=Float.parseFloat(reqStr);
					
					fList.add(reqFloat);
					
					
				}
				
				
				
				
				
			}
			
			
			
			Collections.sort(fList);
			
		}
		
		
		return fList;
		
	}
	
	
	
	

}
