package com.StringLevels;

public class Main {

    static void reverseString(String str) {
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("1. Reverse = " + rev);
    }

    static void palindrome(String str) {
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)) {
            System.out.println("2. Palindrome");
        }
        else {
            System.out.println("2. Not Palindrome");
        }
    }

    static void countCharacters(String str) {
        System.out.println("3. Character count = " + str.length());
    }

    static void vowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
            else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            }
        }

        System.out.println("4. Vowels = " + vowels);
        System.out.println("   Consonants = " + consonants);
    }

    static void countTypes(String str) {
        int alphabets = 0;
        int digits = 0;
        int spaces = 0;
        int special = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphabets++;
            }
            else if(ch >= '0' && ch <= '9') {
                digits++;
            }
            else if(ch == ' ') {
                spaces++;
            }
            else {
                special++;
            }
        }

        System.out.println("5. Alphabets = " + alphabets);
        System.out.println("   Digits = " + digits);
        System.out.println("   Spaces = " + spaces);
        System.out.println("   Special Characters = " + special);
    }

    static void lowercaseToUppercase(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
        }

        System.out.println("6. Uppercase = " + result);
    }

    static void uppercaseToLowercase(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result = result + ch;
        }

        System.out.println("7. Lowercase = " + result);
    }

    static void removeSpaces(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }

        System.out.println("8. Without spaces = " + result);
    }

    static void countSpaces(String str) {
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("9. Space count = " + count);
    }

    static void firstRepeatedCharacter(String str) {
        for(int i = 0; i < str.length(); i++) {

            for(int j = i + 1; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {
                    System.out.println("10. First repeated character = " + str.charAt(i));
                    return;
                }
            }
        }

        System.out.println("10. No repeated character");
    }

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "madam";
        String str3 = "Java Programming";
        String str4 = "Java@123 #";
        String str5 = "java";
        String str6 = "JAVA";
        String str7 = "Java is easy";
        String str8 = "programming";

        reverseString(str1);
        palindrome(str2);
        countCharacters(str3);
        vowelsConsonants(str1);
        countTypes(str4);
        lowercaseToUppercase(str5);
        uppercaseToLowercase(str6);
        removeSpaces(str7);
        countSpaces(str7);
        firstRepeatedCharacter(str8);
    }
}