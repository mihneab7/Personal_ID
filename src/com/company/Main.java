package com.company;

public class Main {

    public static void main(String[] args) {
		int n=7;
		int i=1;
		if (n<=0) {
			System.out.println("nu sunt numere naturale impare");
			System.exit(0);
		} else {
			while (i <= 2 * n) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
				i += 1;
			}
		}
    }

    }
