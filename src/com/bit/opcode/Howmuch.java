package com.bit.opcode;

import java.util.Scanner;

public class Howmuch {
	
	public  void main( ) {
		Scanner s = new Scanner(System.in);
		int a = 0, b = 0, c = 0, dc = 0, avg = 0;
		String arr[] = new String[9];
		arr[0] = "얼마에요?\n";
		arr[1] = "원 입니다";
		arr[2] = "몇개드릴까요?\n";
		arr[3] = "5개주세요?\n";
		arr[4] = "원 입니다";
		arr[5] = "비싸요깎아주세요";
		arr[6] = "몇%요?\n";
		arr[7] = "안팔아요\n";
		arr[8] = "원만주세요\n";
		
		System.out.print(arr[0]);
		a = s.nextInt();
		System.out.print(a+arr[1]);
		System.out.print(arr[2]);
		b= s.nextInt();
		System.out.print(arr[3]);
		c = (a*b);
		System.out.print(c+arr[4]);
		System.out.print(arr[5]);
		System.out.print(arr[6]);
		dc = s.nextInt();
		
		if(dc > 10){
			System.out.println(arr[7]);
		}else avg = c*(100-dc)/100;
			System.out.println(avg + arr[8]);
		
	}
}
