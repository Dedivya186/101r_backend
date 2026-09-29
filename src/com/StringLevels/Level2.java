package com.StringLevels;



import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 11. Frequency of each character

		String str = "programming";

		for(int i = 0; i < str.length(); i++) {

			int count = 0;

			for(int j = 0; j < str.length(); j++) {

				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}

			boolean alreadyPrinted = false;

			for(int k = 0; k < i; k++) {

				if(str.charAt(i) == str.charAt(k)) {
					alreadyPrinted = true;
					break;
				}
			}

			if(!alreadyPrinted) {
				System.out.println(str.charAt(i) + " = " + count);
			}
		}


		// 12. First non-repeated character

		String str1 = "swiss";

		for(int i = 0; i < str1.length(); i++) {

			int count = 0;

			for(int j = 0; j < str1.length(); j++) {

				if(str1.charAt(i) == str1.charAt(j)) {
					count++;
				}
			}

			if(count == 1) {
				System.out.println(str1.charAt(i));
				break;
			}
		}


		// 13. First repeated character

		String str2 = "programming";

		for(int i = 0; i < str2.length(); i++) {

			int count = 0;

			for(int j = 0; j < str2.length(); j++) {

				if(str2.charAt(i) == str2.charAt(j)) {
					count++;
				}
			}

			if(count > 1) {
				System.out.println(str2.charAt(i));
				break;
			}
		}


		// 14. Find duplicate characters

		String str3 = "programming";

		for(int i = 0; i < str3.length(); i++) {

			int count = 0;

			for(int j = 0; j < str3.length(); j++) {

				if(str3.charAt(i) == str3.charAt(j)) {
					count++;
				}
			}

			boolean alreadyPrinted = false;

			for(int k = 0; k < i; k++) {

				if(str3.charAt(i) == str3.charAt(k)) {
					alreadyPrinted = true;
					break;
				}
			}

			if(count > 1 && !alreadyPrinted) {
				System.out.println(str3.charAt(i));
			}
		}


		// 15. Remove duplicate characters

		String str4 = "programming";

		String result = "";

		for(int i = 0; i < str4.length(); i++) {

			boolean found = false;

			for(int j = 0; j < result.length(); j++) {

				if(str4.charAt(i) == result.charAt(j)) {
					found = true;
					break;
				}
			}

			if(!found) {
				result = result + str4.charAt(i);
			}
		}

		System.out.println(result);


		// 16. Character having maximum frequency

		String str5 = "programming";

		int max = 0;
		char a = ' ';

		for(int i = 0; i < str5.length(); i++) {

			int count = 0;

			for(int j = 0; j < str5.length(); j++) {

				if(str5.charAt(i) == str5.charAt(j)) {
					count++;
				}
			}

			if(count > max) {
				max = count;
				a = str5.charAt(i);
			}
		}

		System.out.println(a);


		// 17. Character having minimum frequency

		String str6 = "programming";

		int min = str6.length();
		char b = ' ';

		for(int i = 0; i < str6.length(); i++) {

			int count = 0;

			for(int j = 0; j < str6.length(); j++) {

				if(str6.charAt(i) == str6.charAt(j)) {
					count++;
				}
			}

			if(count < min) {
				min = count;
				b = str6.charAt(i);
			}
		}

		System.out.println(b);


		// 18. Check whether all characters are unique

		String str7 = "abcde";

		boolean unique = true;

		for(int i = 0; i < str7.length(); i++) {

			int count = 0;

			for(int j = 0; j < str7.length(); j++) {

				if(str7.charAt(i) == str7.charAt(j)) {
					count++;
				}
			}

			if(count > 1) {
				unique = false;
				break;
			}
		}

		System.out.println(unique);
	}
}