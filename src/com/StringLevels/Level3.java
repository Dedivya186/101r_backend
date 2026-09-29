package com.StringLevels;



import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		// 19. Count the number of words in a String

		String str = "Java is easy to learn";

		String[] words = str.split(" ");

		System.out.println(words.length);


		// 20. Reverse each word without changing word order

		String str1 = "Java is easy";

		String[] words1 = str1.split(" ");

		for(int i = 0; i < words1.length; i++) {

			String rev = "";

			for(int j = words1[i].length() - 1; j >= 0; j--) {

				rev = rev + words1[i].charAt(j);
			}

			System.out.print(rev + " ");
		}

		System.out.println();


		// 21. Reverse the order of words

		String str2 = "Java is easy";

		String[] words2 = str2.split(" ");

		for(int i = words2.length - 1; i >= 0; i--) {

			System.out.print(words2[i] + " ");
		}

		System.out.println();


		// 22. Find the longest word

		String str3 = "Java programming language";

		String[] words3 = str3.split(" ");

		String longest = "";

		for(int i = 0; i < words3.length; i++) {

			if(words3[i].length() > longest.length()) {
				longest = words3[i];
			}
		}

		System.out.println(longest);


		// 23. Find the shortest word

		String str4 = "Java programming language";

		String[] words4 = str4.split(" ");

		String shortest = words4[0];

		for(int i = 1; i < words4.length; i++) {

			if(words4[i].length() < shortest.length()) {
				shortest = words4[i];
			}
		}

		System.out.println(shortest);


		// 24. Find the length of each word

		String str5 = "Java is easy";

		String[] words5 = str5.split(" ");

		for(int i = 0; i < words5.length; i++) {

			System.out.println(words5[i] + " = " + words5[i].length());
		}


		// 25. Find the frequency of each word

		String str6 = "java is easy java is powerful";

		String[] words6 = str6.split(" ");

		for(int i = 0; i < words6.length; i++) {

			int count = 0;

			for(int j = 0; j < words6.length; j++) {

				if(words6[i].equals(words6[j])) {
					count++;
				}
			}

			boolean alreadyPrinted = false;

			for(int k = 0; k < i; k++) {

				if(words6[i].equals(words6[k])) {
					alreadyPrinted = true;
					break;
				}
			}

			if(!alreadyPrinted) {
				System.out.println(words6[i] + " = " + count);
			}
		}


		// 26. Find duplicate words

		String str7 = "java is easy java is powerful";

		String[] words7 = str7.split(" ");

		for(int i = 0; i < words7.length; i++) {

			int count = 0;

			for(int j = 0; j < words7.length; j++) {

				if(words7[i].equals(words7[j])) {
					count++;
				}
			}

			boolean alreadyPrinted = false;

			for(int k = 0; k < i; k++) {

				if(words7[i].equals(words7[k])) {
					alreadyPrinted = true;
					break;
				}
			}

			if(count > 1 && !alreadyPrinted) {
				System.out.println(words7[i]);
			}
		}


		// 27. Remove duplicate words

		String str8 = "java is easy java is powerful";

		String[] words8 = str8.split(" ");

		String result = "";

		for(int i = 0; i < words8.length; i++) {

			boolean found = false;

			for(int j = 0; j < result.length(); j++) {
			}

			String[] resultWords = result.split(" ");

			if(result.length() > 0) {

				for(int j = 0; j < resultWords.length; j++) {

					if(words8[i].equals(resultWords[j])) {
						found = true;
						break;
					}
				}
			}

			if(!found) {
				result = result + words8[i] + " ";
			}
		}

		System.out.println(result);


		// 28. Find the first repeated word

		String str9 = "java is easy java is powerful";

		String[] words9 = str9.split(" ");

		for(int i = 0; i < words9.length; i++) {

			int count = 0;

			for(int j = 0; j < words9.length; j++) {

				if(words9[i].equals(words9[j])) {
					count++;
				}
			}

			if(count > 1) {
				System.out.println(words9[i]);
				break;
			}
		}


		// 29. Find the first non-repeated word

		String str10 = "java is easy java is powerful";

		String[] words10 = str10.split(" ");

		for(int i = 0; i < words10.length; i++) {

			int count = 0;

			for(int j = 0; j < words10.length; j++) {

				if(words10[i].equals(words10[j])) {
					count++;
				}
			}

			if(count == 1) {
				System.out.println(words10[i]);
				break;
			}
		}


		// 30. Capitalize the first character of every word

		String str11 = "java is powerful";

		String[] words11 = str11.split(" ");

		for(int i = 0; i < words11.length; i++) {

			char ch = words11[i].charAt(0);

			if(ch >= 'a' && ch <= 'z') {
				ch = (char)(ch - 32);
			}

			System.out.print(ch + words11[i].substring(1) + " ");
		}
	}
}
