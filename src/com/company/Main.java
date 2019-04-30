package com.company;

public class Main {

    public static void main(String[] args) {
//    	int n=12;
//    	if (n<0||n>11) {
//    		System.out.println("numar gresit");
//		}
//    	else if (n==0||n==1||n==11) {
//    		System.out.println("Iarna");
//		}
//    	else if (n==2||n==3||n==4) {
//    		System.out.println("Primavara");
//		}
//    	else if (n==5||n==6||n==7) {
//    		System.out.println("Vara");
//		}
//    	else if (n==8||n==9||n==10) {
//    		System.out.println("Toamna");
//		}
		int n=2;
		switch (n) {
			default: System.out.println("numar gresit");
			break;
			case 0:
			case 1:
			case 11: System.out.println("Iarna");
			break;
			case 2:
			case 3:
			case 4: System.out.println("Primavara");
			break;
			case 5:
			case 6:
			case 7: System.out.println("Vara");
			break;
			case 8:
			case 9:
			case 10: System.out.println("Toamna");
			break;
		}
		}
    }
