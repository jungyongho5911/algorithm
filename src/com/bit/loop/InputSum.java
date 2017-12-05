package com.bit.loop;

import java.util.Scanner;

/*
 사용자가 원하는대로 숫자를 입력하게하고
 0응 누르면 총누적된 합계를 보여주는 어플
 * */

public class InputSum {
	public  void main() {
		Scanner scanner = new Scanner(System.in);
		int a =0,sum=0;
		while(true){
			System.out.print("숫자입력");
			a = scanner.nextInt();
			sum += a;
			switch(a) {
			case 0 :
				System.out.println(sum);
				break;
			}
		}
	}
}
