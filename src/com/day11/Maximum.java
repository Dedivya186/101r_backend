package com.day11;

class Maximum {

    int max(int a, int b) {
        return a > b ? a : b;
    }

    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    double max(double a, double b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {

        Maximum m = new Maximum();

        System.out.println("Maximum: " + m.max(10, 25));
        System.out.println("Maximum: " + m.max(10, 25, 15));
        System.out.println("Maximum: " + m.max(10.5, 20.5));
    }
}
