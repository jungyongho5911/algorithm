package com.bit.portal;


import java.util.Scanner;

import com.bit.loop.EvenSum;
import com.bit.loop.ForLoopDemo;
import com.bit.loop.InfiniteDemo;
import com.bit.loop.InputSum;
import com.bit.loop.InputSum1;
import com.bit.loop.Oddsum;

import com.bit.opcode.Bmi;
import com.bit.opcode.Calc;
import com.bit.opcode.CalcSwitch;

import com.bit.opcode.GradeReport;
import com.bit.opcode.Hello;
import com.bit.opcode.Howmuch;
import com.bit.opcode.Ssn;
import com.bit.opcode.WhoAreyou;

public class Potral {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		while(true) {
			System.out.println("숫자를입력하세요");
		System.out.println("1=inputsum,2=bm1,3=calc,4=Cals,5=Grade,6=Hello,7=Howmuch,8=Ssn"
				+"9=Whoareyou,10=Arithmet10,11=Arithemt11,12=Evensum,13=Forloop,14=IfiniteDemo");	
			a = scanner.nextInt();
		switch(a) {
		case 1 :
			InputSum inputSum = new InputSum();
			inputSum.main();
			break;
		case 2 :
			Bmi bmi = new Bmi();
			bmi.main();
			break;
		case 3 :
			Calc calc = new Calc();
			calc.main();
			break;
		case 4 :
			CalcSwitch calcSwitch = new CalcSwitch();
			calcSwitch.main();
			break;
		case 5 :
			GradeReport gradeReport = new GradeReport();
			gradeReport.main();
			break;
		case 6 :
			Hello hello = new Hello();
			hello.main();
			break;
		case 7 :
			Howmuch howmuch = new Howmuch();
			howmuch.main();
			break;
		case 8 :
			Ssn ssn = new Ssn();
			ssn.main();
			break;
		case 9 :
			WhoAreyou whoAreyou = new WhoAreyou();
			whoAreyou.main();
			break;
		case 12 :
			EvenSum evenSum = new EvenSum();
			evenSum.main();
			break;
		case 13 :
			ForLoopDemo forLoopDemo = new ForLoopDemo();
			forLoopDemo.main();
			break;
		case 14 :
			InfiniteDemo infiniteDemo = new InfiniteDemo();
			infiniteDemo.main();
			break;
		case 15 :
			InputSum1 inputSum1 = new InputSum1();
			inputSum1.main();
			break;
		case 16 :
			Oddsum oddsum = new Oddsum();
			oddsum.main();
			break;
		}	
		}
		
	}
}
