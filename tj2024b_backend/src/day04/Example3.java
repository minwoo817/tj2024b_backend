package day04;

import java.security.Timestamp;

import javax.naming.CompoundName;

public class Example3 {

	public static void main(String[] args) {
		
		// [1] for, 1부터 10까지 더하는 과정
			// 1. 
		int sum = 0;
		for(int index = 1; index <= 10; index++) {
			sum += index;
		}
		System.out.println(sum);
			// 문법공부/문제 : ~~문법 반복문 사용하세요. X
			// 실무/프로젝트 : 상황에 따른 코드가 특정한 규칙/패턴에 따라 반복
		
		// [2] 나혼자 코딩!
		for(int value = 1; value<= 10; value++) {
			System.out.println("안녕하세요"+value);
		}
		
		// [3] 구구단, for 중첩, 단마다 곱 계산(단for 안에 곱 for 포함)
		/*int total = 0;
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				total = i * j;
				System.out.println(i + "*" + j + "=" + total);
			}
		}
		*/
		// [4] 1분 복습
		int total1 = 0;
		for(int dan = 3; dan <= 7; dan++) {
			for(int time = 1; time <= 9; time++) {
				total1 = dan * time;
				System.out.println(dan + "*" + time + "=" + total1);
			}
		}
		
		// [5] continue문, 이후의 문장은 수행하지 않고 for문의 증감식으로 이동한다.
		// 1~100까지의 홀수값들의 누적 합계
		int total2 = 0;
		for(int num = 1; num <= 100; num++) {
			if(num % 2 == 0) {
				continue;
			}
			total2 += num;
		}
		System.out.println("1부터 100까지 홀수의 합 :"+ total2);
		
		// [6] brek , 가장 가까운 for/switch 문{ }을 탈출/종료한다.
		int sum3 = 0;
		int num3;
		for(num3 =0; ; num3++) {
			sum3 += num3;
			if(sum3 >=500) {
				break;
			}
		} 
		System.out.println(num3);
		System.out.println(sum3);
		
		// 연습문제
		// 1번
	      int num1 = 10;
	      int num2 = 2;
	      char operator = '+';
	      
	      if(operator=='+') {
	         System.out.println(num1+num2);
	      }else if(operator == '*') {
	         System.out.println(num1*num2);
	      }else if(operator == '-') {
	         System.out.println(num1-num2);
	      }else if(operator == '/') {
	         System.out.println(num1/num2);
	      }
	      
	      switch(operator = '+') {
	      case '+' : System.out.println(num1+num2);
	      }
	      switch(operator = '-') {
	      case '-' : System.out.println(num1-num2);
	      }
	      switch(operator = '*') {
	      case '*' : System.out.println(num1*num2);
	      }
	      switch(operator = '/') {
	      case '/' : System.out.println(num1/num2);
	      }
		
		// 2번
		int total = 0;
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i%2!=0) {
					continue;
				}
				total = i*j;
				System.out.println(i + "*" + j + "=" + total);
			}
		}
		
		//3번
		int 단1;
	    int 곱1;
	    for(단1 = 2;단1<=9 ; 단1++) {
	       for(곱1=1;곱1<=9;곱1++) {
	         if(단1<곱1){
	             break;
	           }
	       System.out.println(단1+"X"+곱1+"="+단1*곱1);
	         }
	      }
	      
	      
	}

}
