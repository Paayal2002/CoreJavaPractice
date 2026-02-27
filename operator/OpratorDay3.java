package com.operator;

public class OpratorDay3 {
	public static void main(String args[]) {
		int i = 90;
		i++;                 //91

		int j = i + 9;       //100

		System.out.println(i++);  //92

		--j;                      //99
		System.out.println(j * i);  //9108
		i++;                        //93
		--i;                        //92
		System.out.println(--i);    //91
		++i;                        //92
		System.out.println(j + 3);  //102

		j--;                        //98
		++j;                        //99
		System.out.println(j + 7);  //106
		j--;                        //98
		i++;                        //93
		--i;                        //92

		System.out.println(i + j);  //190
		System.out.println(i);      //92
		System.out.println(j);      //98

	}
}
