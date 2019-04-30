package com.company;

public class Main {

    public static void main(String[] args) {
		int [] n={2,4,1,6,8,15};
		int max=-1;
		for (int i=0; i<=n.length-1; i++) {
			if (n[i]%2==1) {
				if (n[i]>=max) {
					max=n[i];
				}
			}
		}
		if (max==-1) {
			System.out.println("no");
		} else {
			System.out.println(max);
		}
    }

    }
