package com.bit.opcode;

import java.util.Scanner;

public class GradeReport {
	public void main() {
		Scanner s = new Scanner(System.in);
		String[] arr = {
				"이름",
				"국어점수",
				"영어점수",
				"수학점수",
				"A",
				"B",
				"C",
				"D",
				"E",
				"F",
		};
		int kor = 0, eng = 0, math = 0, avg = 0;
		String opcode = "", result = "";
		System.out.println(arr[0]);
		opcode = s.next();
		System.out.println(arr[1]);
		kor = s.nextInt();
		System.out.println(arr[2]);
		eng = s.nextInt();
		System.out.println(arr[3]);
		math = s.nextInt();
		avg = (kor+eng+math)/3;
		switch(avg /10 ){
			case 9 :
				result =arr[4];
				break;
			case 8 :
				result =arr[5];
				break;
			case 7 :
				result =arr[6];
				break;
			case 6 :
				result =arr[7];
				break;
			case 5 :
				result =arr[8];
				break;
			default :
				result = arr[9];
				
		}
		System.out.printf("%s :[평균] %d:[학점] %s",opcode ,avg ,result);
			
		
	}
}
