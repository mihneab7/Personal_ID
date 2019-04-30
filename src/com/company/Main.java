package com.company;

public class Main {

    public static void main(String[] args) {
    	int n=134526, c, t=0, s=0;
    	while(n!=0) {
    		c=n%10;
    		t+=1;
    		if(t%2==0) {
    			s+=c;
			}
    		n/=10;
		}
    	System.out.println(s);
		}
    }
