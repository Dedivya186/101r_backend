package com.string;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
			
		}
//		System.out.println(rev);
//		if(str.equals(rev)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
//		int vowelCount=0;
//		int consCount=0;
//		System.out.println(str.length());
//		for(int i=0;i<str.length();i++) {
//		
//			char ch=str.toLowerCase().charAt(i);
//			if(ch=='a'|| ch=='e'||ch=='o'||ch=='i'||ch=='u') {
//				vowelCount++;
//			}
//			else {
//				consCount++;
//			}
//			
//		}
//		System.out.println("vowels count:"+vowelCount+"consonants count:"+consCount);
//		int alphaCount=0;
//		int digitCount=0;
//		int spaceCount=0;
//		int specialCount=0;
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			
//			if(Character.isAlphabetic(ch)) {
//				alphaCount++;
//				
//			}
//			else if(Character.isDigit(ch)) {
//				digitCount++;
//				
//			}
//			else if(Character.isWhitespace(ch)) {
//				spaceCount++;
//				
//			}
//			else {
//				specialCount++;
//			}
//			
//		}
//		System.out.println("Alpha count"+alphaCount);
//		System.out.println("Digit count"+digitCount);
//		System.out.println("space count"+spaceCount);
//		System.out.println("sepecial count"+specialCount);
		String result = "";
//		for(int i = 0; i < str.length(); i++) {
//		    char ch = str.charAt(i);
//
//		    if(Character.isLowerCase(ch)) {
//
//		            ch = (char)(ch - 32);
//		        }
//
//		        result += ch;
//		    }
//
//		    System.out.println(result);
		    
//		    for(int i = 0; i < str.length(); i++) {
//			    char ch = str.charAt(i);
//
//			    if(Character.isUpperCase(ch)) {
//
//			            ch = (char)(ch + 32);
//			        }
//
//			        result += ch;
//			    }
//
//			    System.out.println(result);
		
//		for(int i = 0; i < str.length(); i++) {
//		    char ch = str.charAt(i);
//
//		    if(ch != ' ') {
//		        result += ch;
//		    }
//		}
//
//		System.out.println(result);
//		int count = 0;
//
//		for(int i = 0; i < str.length(); i++) {
//		    char ch = str.charAt(i);
//
//		    if(ch == ' ') {
//		        count++;
//		    }
//		}
//
//		System.out.println("Spaces = " + count);
		for(int i = 0; i < str.length(); i++) {

		    int count = 0;

		    for(int j = i + 1; j < str.length(); j++) {

		        if(str.charAt(i) == str.charAt(j)) {
		            count++;
		        }
		    }

		    if(count > 0) {
		        System.out.println(str.charAt(i));
		        break;
		    }
		}
			   
		}
	}


