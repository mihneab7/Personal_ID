package com.company;

public class Main {

    public static void main(String[] args) {
		int [] n={1,2,3,4,5,6,7,8,9,10,11,12};
		int j=5;
		int s=0;
		for(int i=0; i<=n.length-1; i++) {
			if (j!=0) {
				if(n[i]%2==0) {
					s+=n[i];
					j-=1;
				}
			}
		}
		System.out.println(s);
    }

    }
