package com.prowings.interviews_program;

public class Lowest_Number {

	public static void main(String[] args) {

		int []num= {-7,-4,1,5,7};
		
		int closestNumber = 1110;
		
		for(int i=0;i<num.length;i++) {
			
			if(Math.abs(num[i])<=Math.abs(closestNumber)) {
				closestNumber=num[i];
			}
		}
		System.out.println("The closest Number "+closestNumber);
		
		System.out.println(Math.abs(-3));
	}

} 