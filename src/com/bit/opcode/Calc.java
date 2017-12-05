package com.bit.opcode;

import java.util.Scanner;

public class Calc {
	public void main() {
		Scanner s = new Scanner(System.in);
		String[] arr = {
				"첫번째 숫자를 입력해주세요\n",
				"두번째 숫자를 입력해주세요\n",
				"덧셈인경우+,뺄셈인경우-,곱셈인경우*,나눗셈인경우/,나머지인경우% ",
				"+","-","*"	,"/","%",
		};
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "";
		System.out.print(arr[0]);
		num1 = s.nextInt();
		System.out.print(arr[1]);
		num2 = s.nextInt();
		System.out.print(arr[2]);
		opcode = s.next();
		if(opcode.equals(arr[3])) {
			result = num1 + num2;
		}else if(opcode.equals(arr[4])){
			result = num1 - num2;
		}else if(opcode.equals(arr[5])) {
			result = num1 * num2;
		}else if(opcode.equals(arr[6])) {
			result = num1 / num2;
		}else if(opcode.equals(arr[7])){
			result = num1 % num2;
		}
			System.out.printf("%d %s %d = %d",
								num1, opcode, num2, result);
}
}