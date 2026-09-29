package com.string;

public class Example3 {

	public static void main(String[] args) {
//		String str = "Java is easy to learn";
//		String[] words = str.split(" ");
//		System.out.println(words.length);
//		String str = "Java is easy";
//
//		String[] words = str.split(" ");
//		String[] result = new String[words.length];
//
//		for(int i=0;i<words.length;i++){
//		    String rev = "";
//		    
//		    for(int j=words[i].length()-1;j>=0;j--){
//		        rev += words[i].charAt(j);
//		    }
//		    
//		    result[i] = rev;
//		}
//
//		for(int i=0;i<result.length;i++){
//		    System.out.print(result[i] + " ");
//		}
//		String str = "Java is easy";
//
//		String[] words = str.split(" ");
//
//		for(int i=words.length-1;i>=0;i--){
//		    System.out.print(words[i] + " ");
//		}
//		String str = "Java programming language";
//
//		String[] words = str.split(" ");
//
//		int max = 0;
//		String result = "";
//
//		for(int i=0;i<words.length;i++){
//		    if(words[i].length() > max){
//		        max = words[i].length();
//		        result = words[i];
//		    }
//		}
//
//		System.out.println(result);
//		String str = "Java is programming";
//
//		String[] words = str.split(" ");
//
//		int min = str.length();
//		String result = "";
//
//		for(int i=0;i<words.length;i++){
//		    if(words[i].length() < min){
//		        min = words[i].length();
//		        result = words[i];
//		    }
//		}
//
//		System.out.println(result);
		String str = "Java is easy";

		String[] words = str.split(" ");

		for(int i=0;i<words.length;i++){
		    System.out.println(words[i] + " = " + words[i].length());
		}
	}

}
