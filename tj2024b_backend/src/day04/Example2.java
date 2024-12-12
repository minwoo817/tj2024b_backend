package day04;

public class Example2 {

	public static void main(String[] args) {
		
		// [1] while문
		/*
			while(조건식){
			실행문
			}
			- 조건식이 true이면 { }안에 있는 실행문 실행한다.
		 
		 
		*/
		// [1] while문 활용하여 1부터 10까지 더하기
		int num = 1;	// 초기값
		int sum = 0;	// = 0이 없으면 오류 발생
			// 정수가 없다는 것과 0은 다르다.
			// int sum; 변수가 참조 또는 가지고 있는 값이 없다. 쓰레기값, 임의값
			// 쓰레기값(임의값/초기값이 없는 상태) vs 0 vs Null vs '' vs "" 
			// * 변수에 0을 대입하지 않으면 초기값이 없으므로 임의값(쓰레기값)은 연산을 할 수 없다.
		while(num <= 10) {	// 조건문
			sum += num;
			num++;		// 증감식
		}
		System.out.println(sum);
		
		// - for문 처리
		int sum2 = 0;
		for(int num2 = 1; num2 <= 10; num2++) {
			// 1. 초기값; 2. 조건문; 3. 증감식
			sum2 += num2;
		}
		System.out.println(sum2);
		
		// [2] while문이 무한히 반복되는 경우
		/*while(true) {
			System.out.println("쇼핑몰 24시 실행중!!");
		}*/
		
		// - for문 표현
		/*for( ; ; ) {
			System.out.println("쇼핑몰 24시 실행중!!");
		}*/
		
		// [3] do ~ while문 , 1~10까지 더하는 프로그램
		int num3 = 1;
		int sum3 = 0;
		do {
			sum3 += num3;
			num3++;
		} 
		while(num3 <= 10);
		System.out.println(sum3);
	
		// [4] 구구단중에서 2단만 출력하시오. while과 do while문으로 구현하기.
		int num4 = 1;		// 1. 초기값
		int total1 = 0;
		while(num4 < 10) {	// 2. 조건식 		// 선 조건검사 --> 후 실행
			total1 = num4 * 2;
			System.out.printf("2 * %d = %d \n", num4, total1);
			num4++;			// 3. 증감식
		}
		
		int num5 = 1; 		// 1. 초기값 		// 선 실행
		int total2 = 0;
		do {
			total2 = num5 * 2;
			System.out.printf("2 * %d = %d \n", num5, total2);
			num5++; 		// 2. 증감식
		}
		while(num5 < 10);	// 3. 조건식		// 후 조건검사
		
		// 3. for문
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %d \n", i, (2*i));
		}
			
	}
}
