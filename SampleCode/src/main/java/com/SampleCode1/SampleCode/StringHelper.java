package com.SampleCode1.SampleCode;

public class StringHelper {
	
	public String truncateAInFirst2Positions(String str){
		if(str.length()<=2)
			return str.replace("A", "");
		
		String first2Chars=str.substring(0,2);
		String stringMinusFirst2Chars = str.substring(2);
		
		return first2Chars.replace("A", "")+stringMinusFirst2Chars;
	}

}
