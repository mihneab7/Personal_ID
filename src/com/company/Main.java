package com.company;

public class Main {

    public static void main(String[] args) {
    	int n=1234, c, m, t=0, sp=0, si=0;
    	while(n!=0) {
    		c=n%10;
    		t+=1;
    		if(t%2==0) {
    			sp+=c;
			}
    		else {
    			si+=c;
			}
    		n/=10;
		}
    	m=sp-si;
    	System.out.println(m);
		}
    }
