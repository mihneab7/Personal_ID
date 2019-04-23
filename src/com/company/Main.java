package com.company;

public class Main {

    public static void main(String[] args) {
	// "# ## ### #### ### ## #"
		int n=7,i;
		String s1="",s2="",s3="",s4="",s5="";
		for(i=1; i<=n; i++) {
			if (i==1) {
				s1="# ";
			}
			else if (i==2||i==6) {
				s2="## ";
			}
			else if (i==3||i==5) {
				s3="### ";
			}
			else if (i==4) {
				s4="#### ";
			}
			else if (i==7) {
				s5="#";
			}
		}
		System.out.println(s1+s2+s3+s4+s3+s2+s5);
    }

    }
