package com.sona.string;

public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		String s1="Vaiju";
		String s2="Chaitu";
		System.out.println("Before Swap: "+s1+ " "+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After Swap: "+s1+ " "+s2+" "+s1.substring(0,s1.length()-s2.length()));
		
		
		int a=10;
		int b=20;
		System.out.println("Before swapping "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping "+a+" "+b);
	}

}
