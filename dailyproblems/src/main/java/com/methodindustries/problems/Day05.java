package com.methodindustries.problems;

public class Day05 {
		
    public static char[] ReverseWords(char[] s) {
		System.out.print("Lets reverse the words inplace for : ");
		System.out.println(s);
		System.out.println("");
		int numberofchar=0;
		int StartPosition=0;
		int SubSize=0;
		s=reverseletters(s,0,s.length);		
		for (int i=0; i < s.length;i++) {
			numberofchar++;
			if (s[i]==(' ') || i==s.length-1){				
					StartPosition=i-(numberofchar-1);
					SubSize=(numberofchar-1);
					if (i==s.length-1) {
						SubSize=SubSize+1;
					}				
					//System.out.println(reverseletters(s,StartPosition,SubSize));
					s=reverseletters(s,StartPosition,SubSize);
					numberofchar=0;
			}
		}
	System.out.println(s);
	return s;
    }

    public static char[] reverseletters(char[] FullString,int LowerBound,int InternalSize) {
    	int Midsize=0;
   		int UpperBound=LowerBound+InternalSize;
  		if (InternalSize % 2 ==0) {
   			Midsize=InternalSize/2;
   		}else {
   			Midsize=(InternalSize-1)/2;
   		}
   	   	for (int i=0; i<(Midsize);i++) {
   			
   			char tempchar=FullString[i+LowerBound];
   			FullString[i+LowerBound]=FullString[UpperBound-i-1];
   			FullString[UpperBound-1-i]=tempchar;
   		}
   		return FullString;
    }

}
    
