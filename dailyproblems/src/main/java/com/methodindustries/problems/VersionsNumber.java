package com.methodindustries.problems;


public class VersionsNumber{
	public static Integer compare(String v1, String v2) {
		//String E3a = "1.0.37.2.1";
		//String E3b = "1";
		
		String array1[] = v1.split("\\.");
		String array2[] = v2.split("\\.");
		int l=array1.length;
		if (array2.length < array1.length) {
			l=array2.length;
		}
		for (int i=0; i < l; i++) {
			if (Integer.valueOf(array1[i]) > Integer.valueOf(array2[i])) {
				return 1;
			}
			if (Integer.valueOf(array1[i]) < Integer.valueOf(array2[i])) {
				return 0;
			}
		}
		if (array2.length > array1.length) {
			return 0;
		}
		if (array1.length > array2.length){
			for (int i=array2.length;i<array1.length;i++) {
				if (Integer.valueOf(array1[i]) !=0) {
					return 1;
				}
			}
		}
		

		return -1;
	}
   
	
}
    		
