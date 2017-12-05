package com.bit.opcode;

import java.util.Scanner;

public class ClacSwitch2 {
	public  void main() {
		Scanner s = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "";
		System.out.print("첫번째값\n");
		num1 = s.nextInt();
		System.out.print("연산자를 입력하세요\n");
		opcode = s.next();
		System.out.print("두번째값\n");
		num2 = s.nextInt();
		
		switch(opcode) {
			case "+" :
			result = num1+num2;
			break;
			case "-" :
			result = num1-num2;
			break;
			case "/" :
			result = num1/num2;
			break;
			case "*" :
			result = num1*num2;
			break;
		}
		System.out.printf("%s %d %s = %s",num1,opcode,num2,result);
	}
}
