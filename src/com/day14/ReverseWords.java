package com.day14;



import java.util.Scanner;

class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        while (str.length() > 0) {

            int index = str.lastIndexOf(' ');

            if (index == -1) {
                System.out.print(str);
                break;
            }

            System.out.print(str.substring(index + 1) + " ");

            str = str.substring(0, index);
        }
    }
}