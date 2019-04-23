package com.company;

public class Main {

    public static void main(String[] args) {
		int n=6, nrPasi=1;
		while (n!=1) {
		    if (n%2==0) {
		        n=n/2;
            }
		    else {
		        n=3*n+1;
            }
		    nrPasi+=1;
        }
		System.out.println(nrPasi);
    }

    }
