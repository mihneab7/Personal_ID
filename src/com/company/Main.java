package com.company;

public class Main {

    public static void main(String[] args) {
		int [] n={1,4,3,5};
		int nrPare=0;
		int nrImpare=0;
		for(int i=0; i<=n.length-1; i++) {
		    if (n[i]%2==0) {
		        nrPare+=1;
            } else if (n[i]%2==1) {
		        nrImpare+=1;
            }
        }
		System.out.println(nrPare);
		System.out.println(nrImpare);
    }

    }
